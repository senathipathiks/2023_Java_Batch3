import axios from "axios";

const baseURL = "http://localhost:1234/";

const ShopService = {
  getAllShop: () => axios.get(`${baseURL}GetAllShop`),

  getShopById: (shopId) =>
    axios.get(`${baseURL}GetShopById/${shopId}`),

  createShop: (shop) =>
    axios.post(`${baseURL}CreateShop`, shop),

  deleteShop: (shopId) =>
    axios.delete(`${baseURL}DeleteShop/${shopId}`),
};

export default ShopService;
