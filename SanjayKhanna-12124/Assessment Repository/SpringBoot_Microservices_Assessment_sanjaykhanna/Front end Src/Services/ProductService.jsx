import axios from 'axios';
import { Component } from 'react';

const origin = "http://localhost:1260/";
const createProduct = "createproduct";
const readAllProduct = "readallproduct";
const updateProduct = "updateproduct";
const deleteProduct = "deleteproduct?id=";
const readProduct = "readproduct?id=";

class ProductService extends Component {

    doCreate = (data) => {
        return axios.post(origin + createProduct, data);
    };

    doReadAll = () => {
        return axios.get(origin + readAllProduct);
    };

    doRead = (id) => {
        return axios.get(origin + readProduct + id);
    };

    doUpdate = (data) =>{
        return axios.put(origin+updateProduct, data); 
    };

    doDelete = (id) => {
        return axios.delete(origin + deleteProduct + id)
    };

}
const  productService = new ProductService();
export default productService;
