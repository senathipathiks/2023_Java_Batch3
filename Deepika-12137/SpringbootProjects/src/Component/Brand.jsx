import React, { useEffect, useState } from "react";
import InventoryService from "../Service/InventoryService";
import BrandService from "../Service/BrandService";
import { TextField, Modal, Backdrop, Fade, Box } from "@mui/material";

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

const Brand = () => {
  const [brands, setBrands] = useState([]);
  const [selectedBrand, setSelectedBrand] = useState({
    
        bname: "",
        manufacturer: "",
        productCount: 0,
        contact: "",
        address: "",
        inventory: {
            id: 0
            
        }
  });
  const [modalOpen, setModalOpen] = useState(false);
  const [findModalOpen, setFindModalOpen] = useState(false);
  const [findBrand, setFindBrand] = useState("");
  const [foundBrand, setFoundBrand] = useState(null);
  const [deleteConfirmationOpen, setdeleteConfirmationOpen] = useState(false);
  const [brandToDelete, setBrandToDelete] = useState(null);
  const [inventorys, setInventorys] = useState([]);


  useEffect(() => {
    fetchInventorys();
  }, []);

  const fetchInventorys = () => {
   InventoryService.getAllInventory()
      .then((response) => {
        setInventorys(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  useEffect(() => {
    getAllBrands();
  }, []);

  const getAllBrands = () => {
    BrandService.getAllBrand()
      .then((response) => {
        setBrands(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  const handleDelete = (bid) => {
    setBrandToDelete(bid);
    setdeleteConfirmationOpen(true);
  };

  const confirmDelete = () => {
    if (brandToDelete) {
      BrandService.deleteBrand(brandToDelete)
        .then(() => {
          setBrands(
            brands.filter((brand) => brand.bid != brandToDelete)
          );
          setdeleteConfirmationOpen(false);
          alert(" Deleted Successfully !!!");
        })
        .catch((error) => {
          console.log(error);
          alert("Error Deleting ... !!!");
        });
    }
  };

  const handleUpdateOpen = (brand) => {
    setSelectedBrand(brand);
    setModalOpen(true);
  };

  const handleFind = () => {
    setFindModalOpen(true);
  };

  const handleFindClose = () => {
    setFindModalOpen(false);
    setFoundBrand(null);
    setFindBrand("");
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (selectedBrand.bid) {
      // Update student
      BrandService.updateBrand(selectedBrand.bid, selectedBrand)
        .then(() => {
          alert("Updated Successfully");
          setModalOpen(false);
          getAllBrands();
        })
        .catch((error) => {
          console.log(error);
        });
    } else {
      // Create student
      BrandService.createBrand(selectedBrand)
        .then(() => {
          alert("Created Successfully");
          setModalOpen(false);
          getAllBrands();
          window.location.reload();
        })
        .catch((error) => {
          console.log(error);
        });
    }
  };

  const handleFindBrand = (e) => {
    e.preventDefault();
    BrandService.getBrandById(findBrand)
      .then((response) => {
        setFoundBrand(response.data);
      })
      .catch((error) => {
        console.log(error);
        alert("Not found");
      });
  };
  return (
    <div>
    
    <br></br>
      <h1>Brand management System</h1>
      <br />
      {/* Buttons */}
      <button
        onClick={() => setModalOpen(true)}
        className="btn btn-primary ms-4 px-2"
      >
        Insert Brand
      </button>

      <button
        onClick={handleFind}
        className="btn btn-warning    px-2 mr-2 ms-4 "
      >
        Find Brand
      </button>
      <br />
      <br />
     
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
                  placeholder="Enter Brand Name"
                  name="bname"
                  className="form-control mb-4"
                  value={selectedBrand?.bname || ""}
                  onChange={(e) =>
                    setSelectedBrand({
                      ...selectedBrand,
                      bname: e.target.value,
                    })
                  }
                  required
                />
                <TextField
                  type="text"
                  placeholder="Enter Manufacturer"
                  name="manufacturer"
                  className="form-control mb-4"
                  value={selectedBrand?.manufacturer || ""}
                  onChange={(e) =>
                    setSelectedBrand({
                      ...selectedBrand,
                      manufacturer: e.target.value,
                    })
                  }
                  required
                />
                <TextField
                  type="number"
                  placeholder="Enter Product Count"
                  name="productCount"
                  className="form-control mb-4"
                  value={selectedBrand?.productCount || ""}
                  onChange={(e) =>
                    setSelectedBrand({
                      ...selectedBrand,
                      productCount: e.target.value,
                    })
                  }
                  required
                />
                <TextField
                  type="number"
                  placeholder="Enter Contact"
                  name="contact"
                  className="form-control mb-4"
                  value={selectedBrand?.contact || ""}
                  onChange={(e) =>
                    setSelectedBrand({
                      ...selectedBrand,
                      contact: e.target.value,
                    })
                  }
                  required
                />

             <TextField
                  type="text"
                  placeholder="Enter Address"
                  name="address"
                  className="form-control mb-4"
                  value={selectedBrand?.address || ""}
                  onChange={(e) =>
                    setSelectedBrand({
                      ...selectedBrand,
                      address: e.target.value,
                    })
                  }
                  required
                />
                <select
                  className="form-control mb-4"
                  value={selectedBrand.inventory.id || ""}
                  onChange={(e) =>
                    setSelectedBrand({
                      ...selectedBrand,
                      inventory: {
                        ...selectedBrand.inventory,
                        id: e.target.value,
                      },
                    })
                  }
                >
                  <option value="">Select Inventory...</option>
                  {inventorys.map((inv) => (
                    <option key={inv.id} value={inv.id}>
                      {inv.id}
                    </option>
                  ))}
                </select>
                {/* Other text fields */}
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
      

{/* Find  Modal */}
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
            <form onSubmit={handleFindBrand}>
              <select
                className="form-control"
                value={findBrand || ""}
                onChange={(e) => setFindBrand(Number(e.target.value))}
              >
                <option value="">Select Brand...</option>
                {brands.map((option) => (
                  <option key={option} value={option.bid}>
                    {option.bid}
                  </option>
                ))}
              </select>
              <button className="btn btn-success" type="submit">
                Find Brand
              </button>
            
            </form>
            <button className="btn btn-secondary" onClick={handleFindClose}>
              Close
            </button>
            {foundBrand && (
              <div>
                <table className="table table-striped table-bordered">
                  <thead>
                    <tr>
                      <th>Brand Name</th>
                      <th>Manufacturer</th>
                      <th>Product Count</th>
                      <th>Contact</th>
                      <th>Address</th>
                      <th>Inventory ID</th>
                      <th>Inventory Name</th>
                      <th>Inventory Type</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>{foundBrand.bname}</td>
                      <td>{foundBrand.manufacturer}</td>
                      <td>{foundBrand.productCount}</td>
                      <td>{foundBrand.contact}</td>
                      <td>{foundBrand.address}</td>
                      <td>{foundBrand.inventory.id}</td>
                      <td>{foundBrand.inventory.name}</td>
                      <td>{foundBrand.inventory.type}</td>
                    </tr>
                  </tbody>
                </table>
              </div>
            )}
          </Box>
        </Fade>
      </Modal>

      {/* Student List */}

      <table className="table table-striped table-bordered">
        <thead>
          <tr>
          <th>Brand Name</th>
                      <th>Manufacturer</th>
                      <th>Product Count</th>
                      <th>Contact</th>
                      <th>Address</th>
                      <th>Inventory ID</th>
                      <th>Inventory Name</th>
                      <th>Inventory Type</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {brands.map((brand) => (
            <tr key={brand.id}>
          <td>{brand.bname}</td>
                      <td>{brand.manufacturer}</td>
                      <td>{brand.productCount}</td>
                      <td>{brand.contact}</td>
                      <td>{brand.address}</td>
                      <td>{brand.inventory.id}</td>
                      <td>{brand.inventory.name}</td>
                      <td>{brand.inventory.type}</td>
                   
              {/* Other table data */}
              <td>
                <button
                  onClick={() => handleUpdateOpen(brand)}
                  className="btn btn-primary"
                >
                  Update
                </button>
                <button
                  onClick={() => handleDelete(brand.bid)}
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
        onClose={() => setdeleteConfirmationOpen(false)}
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
                onClick={() => setdeleteConfirmationOpen(false)}
                className="btn btn-secondary px-5 ms-2"
              >
                Cancel
              </button>
            </div>
          </Box>
        </Fade>
      </Modal>
    </div>
  );
};

export default Brand;
