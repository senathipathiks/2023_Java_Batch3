import React, { useEffect, useState } from 'react'
import { TextField, Modal, Backdrop, Fade, Box } from "@mui/material";
import InventoryService from '../Service/InventoryService';

const style = {
    position: "absolute",
    top: "50%",
    left: "50%",
    transform: "translate(-50%, -50%)",
    borderRadius: "0.25em",
    bgcolor: "background.paper",
    border: "2px solid gray",
    boxShadow: 24,
    p: 4,
  };

const Inventory = () => {
  const [inventory, setInventory] = useState([]);
  const [selectedInventory, setselectedInventory] = useState({});
  const [modalOpen, setModalOpen] = useState(false);
  const [findModalOpen, setFindModalOpen] = useState(false);
  const [findInventory, setFindInventory] = useState("");
  const [foundInventory, setFoundInventory] = useState(null);
  const [deleteConfirmationOpen, setDeleteConfirmationOpen] = useState(false);
  const [inventoryToDelete, setInventoryToDelete] = useState(null);
  const [inventorys, setInventorys] = useState([]);

  useEffect(() => {
    getAllInventory();
  }, []);

  const getAllInventory = () => {
    InventoryService.getAllInventory()
      .then((response) => {
        setInventorys(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  const handleDelete = (id) => {
    setInventoryToDelete(id);
    setDeleteConfirmationOpen(true);
  };

  const confirmDelete = () => {
    if (inventoryToDelete) {
      InventoryService.deleteInventory(inventoryToDelete)
        .then(() => {
          setInventory(
            inventory.filter(
              (inventory) => inventory.id != inventoryToDelete
            )
          );
          setDeleteConfirmationOpen(false);
          alert("Deleted Successfully !!!");
          window.location.reload();
        })
        .catch((error) => {
          console.log(error);
          alert("Error Deleting ... !!!");
        });
    }
  };

  const handleFind = () => {
    setFindModalOpen(true);
  };

  const handleFindClose = () => {
    setFindModalOpen(false);
    setFoundInventory(null);
    setFindInventory("");
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    InventoryService.createInventory(selectedInventory)
      .then(() => {
        alert("Created Successfully");
        setModalOpen(false);
        getAllInventory();
        window.location.reload();
      })
      .catch((error) => {
        console.log(error);
      });
  };

  const handleFindInventory = (e) => {
    e.preventDefault();
    InventoryService.getInventoryById(findInventory)
      .then((response) => {
        setFoundInventory(response.data);
      })
      .catch((error) => {
        console.log(error);
        alert("Not found");
      });
  };


  return (
    <div>

<br></br>
      <h1>Inventory management System</h1>
      <br />
      {/* Buttons */}
      <button
        onClick={() => setModalOpen(true)}
        className="btn btn-primary ms-4 px-2"
      >
        Insert Inventory
      </button>
      <button
        onClick={handleFind}
        className="btn btn-warning    px-2 mr-2 ms-4 "
      >
        Find Inventory
      </button>
      <br />
      <br />
      {/* Insert / Update Modal */}

      <Modal
        open={modalOpen}
        onClose={() => setModalOpen(false)}
        aria-labelledby="transition-modal-title"
        aria-describedby="transition-modal-description"
        closeAfterTransition
        BackdropComponent={Backdrop}
        BackdropProps={{
          timeout: 500,
        }}
      >
        <Fade in={modalOpen}>
          <Box sx={style}>
            <div className="d-flex flex-column justify-content-center align-items-center">
              <form onSubmit={handleSubmit}>
                <TextField
                  type="text"
                  placeholder="Enter Inventory Name"
                  name="name"
                  className="form-control mb-4"
                  value={selectedInventory?.name || ""}
                  onChange={(e) =>
                    setselectedInventory({
                      ...selectedInventory,
                      name: e.target.value,
                    })
                  }
                  required
                />

<TextField
                  type="text"
                  placeholder="Enter Inventory Type"
                  name="type"
                  className="form-control mb-4"
                  value={selectedInventory?.type || ""}
                  onChange={(e) =>
                    setselectedInventory({
                      ...selectedInventory,
                      type: e.target.value,
                    })
                  }
                  required
                />
                <center>
                  <button
                    style={{
                      width: "60%",
                      fontFamily: "cursive",
                      fontSize: "20px",
                    }}
                    className="btn btn-primary"
                    type="submit"
                  >
                    Submit
                  </button>
                </center>
              </form>
              <br />
              <button
                style={{
                  width: "30%",
                  fontFamily: "cursive",
                  fontSize: "20px",
                }}
                className="btn btn-secondary "
                onClick={() => setModalOpen(false)}
              >
                Close
              </button>
            </div>
          </Box>
        </Fade>
      </Modal>

       {/* Find Department Model */}
       <Modal
        open={findModalOpen}
        onClose={handleFindClose}
        aria-labelledby="transition-modal-title"
        aria-describedby="transition-modal-description"
        closeAfterTransition
        BackdropComponent={Backdrop}
        BackdropProps={{
          timeout: 500,
        }}
      >
        <Fade in={findModalOpen}>
          <Box sx={style}>
            <form onSubmit={handleFindInventory}>
              <select
                className="form-control"
                value={findInventory || ""}
                onChange={(e) => setFindInventory(Number(e.target.value))}
              >
                <option value="">Select Inventory...</option>
                {inventorys.map((option) => (
                  <option key={option} value={option.id}>
                    {option.id}
                  </option>
                ))}
              </select>
              <button className="btn btn-success" type="submit">
                Find Inventory
              </button>
            </form>
            <button className="btn btn-secondary" onClick={handleFindClose}>
              Close
            </button>
            {foundInventory && (
              <div>
                <table className="table table-striped table-bordered">
                  <thead>
                    <tr>
                      <th>Inventory Name</th>
                      <th>Inventory Type</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>{foundInventory.name}</td>
                      <td>{foundInventory.type}</td>
                    </tr>
                  </tbody>
                </table>
              </div>
            )}
          </Box>
        </Fade>
      </Modal>

      <table className="table table-striped table-bordered">
        <thead>
          <tr>
            <th>Inventory ID</th>
            <th>Inventory Name</th>
            <th>Inventory Type</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {inventorys.map((inv) => (
            <tr key={inv.id}>
              <td>{inv.id}</td>
              <td>{inv.name}</td>
              <td>{inv.type}</td>
              {/* Other table data */}
              <td>
                <button
                  onClick={() => handleDelete(inv.id)}
                  className="btn btn-danger"
                  style={{ marginLeft: "10px" }}
                >
                  Delete
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>

      <Modal
        open={deleteConfirmationOpen}
        onClose={() => setDeleteConfirmationOpen(false)}
        aria-labelledby="delete-confirmation-modal-title"
        aria-describedby="delete-confirmation-modal-description"
        closeAfterTransition
        BackdropComponent={Backdrop}
        BackdropProps={{
          timeout: 500,
        }}
      >
        <Fade in={deleteConfirmationOpen}>
          <Box sx={style}>
            <h4>Are you sure you want to delete?</h4>
            <br />
            <div className="d-flex align-items-center justify-content-center">
              <button
                onClick={confirmDelete}
                className="btn btn-danger px-5 ms-2"
              >
                Delete
              </button>
              <button
                onClick={() => setDeleteConfirmationOpen(false)}
                className="btn btn-secondary px-5 ms-2"
              >
                Cancel
              </button>
            </div>
          </Box>
        </Fade>
      </Modal>
    </div>
  )
}

export default Inventory
