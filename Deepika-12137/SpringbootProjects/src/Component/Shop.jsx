import React, { useEffect, useState } from 'react'
import ShopService from '../Service/ShopService';
import { Backdrop, Box, Fade, Modal, TextField } from '@mui/material';


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

const Shop = () => {
    const [shop, setShop] = useState([]);
    const [selectedShop, setselectedShop] = useState({});
    const [modalOpen, setModalOpen] = useState(false);
    const [findModalOpen, setFindModalOpen] = useState(false);
    const [findShop, setFindShop] = useState("");
    const [foundShop, setFoundShop] = useState(null);
    const [deleteConfirmationOpen, setDeleteConfirmationOpen] = useState(false);
    const [shopToDelete, setShopToDelete] = useState(null);
    const [shops, setShops] = useState([]);
  
    useEffect(() => {
      getAllShop();
    }, []);

    const getAllShop = () => {
       ShopService.getAllShop()
          .then((response) => {
            setShops(response.data);
          })
          .catch((error) => {
            console.log(error);
          });
      };
    
      const handleDelete = (id) => {
        setShopToDelete(id);
        setDeleteConfirmationOpen(true);
      };

      const confirmDelete = () => {
        if (shopToDelete) {
          ShopService.deleteShop(shopToDelete)
            .then(() => {
              setShop(
                shop.filter(
                  (shop) => shop.id != shopToDelete
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
        setFoundShop(null);
        setFindShop("");
      };

      const handleSubmit = (e) => {
        e.preventDefault();
    
        ShopService.createShop(selectedShop)
          .then(() => {
            alert("Created Successfully");
            setModalOpen(false);
            getAllShop();
            window.location.reload();
          })
          .catch((error) => {
            console.log(error);
          });
      };

      const handleFindShop = (e) => {
        e.preventDefault();
        ShopService.getShopById(findShop)
          .then((response) => {
            setFoundShop(response.data);
          })
          .catch((error) => {
            console.log(error);
            alert("Not found");
        });
    };
        
  return (
    <div>
      
      <br></br>
      <h3 className='text-light'>Shop management System</h3>
      <br />
      {/* Buttons */}
      <button
        onClick={() => setModalOpen(true)}
        className="btn btn-primary ms-4 px-2"
      >
        Insert Shop
      </button>
      <button
        onClick={handleFind}
        className="btn btn-warning    px-2 mr-2 ms-4 "
      >
        Find Shop
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
                  placeholder="Enter Item Name"
                  name="name"
                  className="form-control mb-4"
                  value={selectedShop?.name || ""}
                  onChange={(e) =>
                    setselectedShop({
                      ...selectedShop,
                      name: e.target.value,
                    })
                  }
                  required
                />

<TextField
                  type="text"
                  placeholder="Enter Price"
                  name="price"
                  className="form-control mb-4"
                  value={selectedShop?.price || ""}
                  onChange={(e) =>
                    setselectedShop({
                      ...selectedShop,
                      price: e.target.value,
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
            <form onSubmit={handleFindShop}>
              <select
                className="form-control"
                value={findShop || ""}
                onChange={(e) => setFindShop(Number(e.target.value))}
              >
                <option value="">Select Shop...</option>
                {shops.map((option) => (
                  <option key={option} value={option.id}>
                    {option.id}
                  </option>
                ))}
              </select>
              <button className="btn btn-success" type="submit">
                Find Shop
              </button>
            </form>
            <button className="btn btn-secondary" onClick={handleFindClose}>
              Close
            </button>
            {foundShop && (
              <div>
                <table className="table table-striped table-bordered">
                  <thead>
                    <tr>
                      <th>Item Name</th>
                      <th>Item Price</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>{foundShop.name}</td>
                      <td>{foundShop.price}</td>
                    </tr>
                  </tbody>
                </table>
              </div>
            )}
          </Box>
        </Fade>
      </Modal>

      <table className="table text-light table-bordered">
        <thead>
          <tr>
            <th>Shop ID</th>
            <th>Item Name</th>
            <th>Item Price</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {shops.map((shop) => (
            <tr key={shop.id}>
              <td>{shop.id}</td>
              <td>{shop.name}</td>
              <td>{shop.price}</td>
              {/* Other table data */}
              <td>
                <button
                  onClick={() => handleDelete(shop.id)}
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

export default Shop
