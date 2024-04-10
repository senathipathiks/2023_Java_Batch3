import React, { useState } from "react";
import Modal from "react-modal";

const MyComponent = () => {
  const [modalIsOpen1, setModalIsOpen1] = useState(false);
  const [modalIsOpen2, setModalIsOpen2] = useState(false);

  const openModal1 = () => {
    setModalIsOpen1(true);
  };

  const closeModal1 = () => {
    setModalIsOpen1(false);
  };

  const openModal2 = () => {
    setModalIsOpen2(true);
  };

  const closeModal2 = () => {
    setModalIsOpen2(false);
  };

  return (
    <div>
      <button className="btn btn-primary" onClick={openModal1}>
        Login
      </button>
      <button className="btn btn-primary" onClick={openModal2}>
        Sign Up
      </button>

      <Modal
        isOpen={modalIsOpen1}
        onRequestClose={closeModal1}
        style={{
          overlay: {
            backgroundColor: "rgba(0, 0, 0, 0.75)",
          },
          content: {
            top: "50%",
            left: "50%",
            right: "auto",
            bottom: "auto",
            marginRight: "-50%",
            transform: "translate(-50%, -50%)",
            backgroundColor: "#f2f2f2",
            padding: "20px",
            borderRadius: "5px",
            border: "1px solid #ccc",
          },
        }}
      >
        <form>
          <input type="text" placeholder="Username" />
          <input type="password" placeholder="Password" />
          <button type="submit">Login</button>
        </form>
      </Modal>

      <Modal
        isOpen={modalIsOpen2}
        onRequestClose={closeModal2}
        style={{
          overlay: {
            backgroundColor: "rgba(0, 0, 0, 0.75)",
          },
          content: {
            top: "50%",
            left: "50%",
            right: "auto",
            bottom: "auto",
            marginRight: "-50%",
            transform: "translate(-50%, -50%)",
            backgroundColor: "#f2f2f2",
            padding: "20px",
            borderRadius: "5px",
            border: "1px solid #ccc",
          },
        }}
      >
        <form>
          <input type="text" placeholder="Name" />
          <input type="text" placeholder="Username" />
          <input type="password" placeholder="Password" />
          <button type="submit">Sign Up</button>
        </form>
      </Modal>
    </div>
  );
};

export default MyComponent;
