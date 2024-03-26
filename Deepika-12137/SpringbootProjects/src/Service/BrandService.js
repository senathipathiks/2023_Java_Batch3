import axios from "axios";

const baseURL = "http://localhost:1235/";

const BrandService = {
  // getAllStudent: () => axios.get(baseURL + "GetAllStudent"),
  getAllBrand: () => axios.get(`${baseURL}GetAllBrand`),

  getBrandById: (brandId) =>
    axios.get(`${baseURL}GetBrandById/${brandId}`),

  updateBrand: (brandId, brand) =>
    axios.put(`${baseURL}UpdateBrand/${brandId}`, brand),

  createBrand: (brand) => axios.post(`${baseURL}CreateBrand`, brand),

  deleteBrand: (brandId) =>
    axios.delete(`${baseURL}DeleteBrand/${brandId}`),
};

export default BrandService;
