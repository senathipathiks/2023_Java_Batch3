import React, { useEffect, useState } from "react";
import ShopService from "../Service/ShopService";
import CustomerService from "../Service/CustomerService";
import { Backdrop, Box, Fade, Modal, TextField } from "@mui/material";

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

const Customer = () => {
  const [customers, setCustomers] = useState([]);
  const [selectedCustomer, setSelectedCustomer] = useState({
    cname: "",
    phoneNo: "",
    address: "",
    quantity: "",
    type: "",
    shop: {
      id: 0,
    },
  });

  const [modalOpen, setModalOpen] = useState(false);
  const [findModalOpen, setFindModalOpen] = useState(false);
  const [findCustomer, setFindCustomer] = useState("");
  const [foundCustomer, setFoundCustomer] = useState(null);
  const [deleteConfirmationOpen, setdeleteConfirmationOpen] = useState(false);
  const [customerToDelete, setCustomerToDelete] = useState(null);
  const [shops, setIShops] = useState([]);

  useEffect(() => {
    fetchShops();
  }, []);

  const fetchShops = () => {
    ShopService.getAllShop()
      .then((response) => {
        setIShops(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  useEffect(() => {
    getAllCustomers();
  }, []);

  const getAllCustomers = () => {
    CustomerService.getAllCustomer()
      .then((response) => {
        setCustomers(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  const handleDelete = (bid) => {
    setCustomerToDelete(bid);
    setdeleteConfirmationOpen(true);
  };

  const confirmDelete = () => {
    if (customerToDelete) {
      CustomerService.deleteCustomer(customerToDelete)
        .then(() => {
          setCustomers(
            customers.filter((customer) => customer.cid != customerToDelete)
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

  const handleUpdateOpen = (customer) => {
    setSelectedCustomer(customer);
    setModalOpen(true);
  };

  const handleFind = () => {
    setFindModalOpen(true);
  };

  const handleFindClose = () => {
    setFindModalOpen(false);
    setFoundCustomer(null);
    setFindCustomer("");
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (selectedCustomer.cid) {
      // Update student
      CustomerService.updateCustomer(selectedCustomer.cid, selectedCustomer)
        .then(() => {
          setCustomers(
            customers.map((c) =>
              c.cid === selectedCustomer.cid ? selectedCustomer : c
            )
          );
          setModalOpen(false);
          getAllCustomers();
        })
        .catch((error) => {
          console.log(error);
        });
    } else {
      // Create student
      CustomerService.createCustomer(selectedCustomer)
        .then(() => {
          setModalOpen(false);
          getAllCustomers();
          window.location.reload();
        })
        .catch((error) => {
          console.log(error);
        });
    }
  };

  const handleFindCustomer = (e) => {
    e.preventDefault();
    CustomerService.getCustomerById(findCustomer)
      .then((response) => {
        setFoundCustomer(response.data);
      })
      .catch((error) => {
        console.log(error);
        alert("Not found");
      });
  };
  return (
    <div>
      <div>
        <br></br>
        <h3 className="text-light">Customer management System</h3>
        <br />
        {/* Buttons */}
        <button
          onClick={() => setModalOpen(true)}
          className="btn btn-primary ms-4 px-2"
        >
          Insert Customer
        </button>

        <button
          onClick={handleFind}
          className="btn btn-warning    px-2 mr-2 ms-4 "
        >
          Find Customer
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
                    placeholder="Enter Customer Name"
                    name="cname"
                    className="form-control mb-4"
                    value={selectedCustomer?.cname || ""}
                    onChange={(e) =>
                      setSelectedCustomer({
                        ...selectedCustomer,
                        cname: e.target.value,
                      })
                    }
                    required
                  />
                  <TextField
                    type="text"
                    placeholder="Enter PhoneNo"
                    name="phoneNo"
                    className="form-control mb-4"
                    value={selectedCustomer?.phoneNo || ""}
                    onChange={(e) =>
                      setSelectedCustomer({
                        ...selectedCustomer,
                        phoneNo: e.target.value,
                      })
                    }
                    required
                  />
                  <TextField
                    type="text"
                    placeholder="Enter Address"
                    name="address"
                    className="form-control mb-4"
                    value={selectedCustomer?.address || ""}
                    onChange={(e) =>
                      setSelectedCustomer({
                        ...selectedCustomer,
                        address: e.target.value,
                      })
                    }
                    required
                  />
                  <TextField
                    type="text"
                    placeholder="Enter Quantity"
                    name="quantity"
                    className="form-control mb-4"
                    value={selectedCustomer?.quantity || ""}
                    onChange={(e) =>
                      setSelectedCustomer({
                        ...selectedCustomer,
                        quantity: e.target.value,
                      })
                    }
                    required
                  />

                  <TextField
                    type="text"
                    placeholder="Enter Type"
                    name="type"
                    className="form-control mb-4"
                    value={selectedCustomer?.type || ""}
                    onChange={(e) =>
                      setSelectedCustomer({
                        ...selectedCustomer,
                        type: e.target.value,
                      })
                    }
                    required
                  />
                  <select
                    className="form-control mb-4"
                    value={selectedCustomer.shop.id || ""}
                    onChange={(e) =>
                      setSelectedCustomer({
                        ...selectedCustomer,

                        shop: {
                          ...selectedCustomer.shop,
                          id: e.target.value,
                        },
                      })
                    }
                  >
                    <option value="">Select Shop...</option>
                    {shops.map((shop) => (
                      <option key={shop.id} value={shop.id}>
                        {shop.id}
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
              <form onSubmit={handleFindCustomer}>
                <select
                  className="form-control"
                  value={findCustomer || ""}
                  onChange={(e) => setFindCustomer(Number(e.target.value))}
                >
                  <option value="">Select Customer...</option>
                  {customers.map((option) => (
                    <option key={option} value={option.cid}>
                      {option.cid}
                    </option>
                  ))}
                </select>
                <button className="btn btn-success" type="submit">
                  Find Customer
                </button>
              </form>
              <button className="btn btn-secondary" onClick={handleFindClose}>
                Close
              </button>
              {foundCustomer && (
                <div>
                  <table className="table table-striped table-bordered">
                    <thead>
                      <tr>
                        <th>Customer Name</th>
                        <th>PhoneNo</th>
                        <th>Address</th>
                        <th>Quantity</th>
                        <th>Type</th>
                        <th> ID</th>
                        <th>Item Name</th>
                        <th>Price</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>{foundCustomer.cname}</td>
                        <td>{foundCustomer.phoneNo}</td>
                        <td>{foundCustomer.address}</td>
                        <td>{foundCustomer.quantity}</td>
                        <td>{foundCustomer.type}</td>
                        <td>{foundCustomer.shop.id}</td>
                        <td>{foundCustomer.shop.name}</td>
                        <td>{foundCustomer.shop.price}</td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              )}
            </Box>
          </Fade>
        </Modal>

        <table className="table table-bordered text-light">
          <thead>
            <tr>
              <th>Customer ID</th>
              <th>Customer Name</th>
              <th>PhoneNo</th>
              <th>Address</th>
              <th>Quantity</th>
              <th>Type</th>
              <th>ID</th>
              <th>Item Name</th>
              <th>Item price</th>
              <th>Action</th>
            </tr>
          </thead>
          <tbody>
            {customers.map((customer) => (
              <tr key={customer.cid}>
                <td>{customer.cid}</td>
                <td>{customer.cname}</td>
                <td>{customer.phoneNo}</td>
                <td>{customer.address}</td>
                <td>{customer.quantity}</td>
                <td>{customer.type}</td>
                <td>{customer.shop.id}</td>
                <td>{customer.shop.name}</td>
                <td>{customer.shop.price}</td>

                {/* Other table data */}
                <td>
                  <button
                    onClick={() => handleUpdateOpen(customer)}
                    className="btn btn-primary"
                  >
                    Update
                  </button>
                  <button
                    onClick={() => handleDelete(customer.cid)}
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
    </div>
  );
};

export default Customer;
