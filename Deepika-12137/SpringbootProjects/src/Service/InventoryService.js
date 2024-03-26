import axios from "axios";

const baseURL = "http://localhost:1235/";

const InventoryService = {
  getAllInventory: () => axios.get(`${baseURL}GetAllInventory`),

  getInventoryById: (inventoryId) =>
    axios.get(`${baseURL}GetInventoryById/${inventoryId}`),

  createInventory: (inventory) =>
    axios.post(`${baseURL}CreateInventory`, inventory),

  deleteInventory: (inventoryId) =>
    axios.delete(`${baseURL}DeleteInventory/${inventoryId}`),
};

export default InventoryService;
