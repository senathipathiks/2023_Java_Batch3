

import React, { Component } from 'react'
import axios from "axios";

const Get = "http://localhost:5001/Get";
const Post = "http://localhost:5001/Create";
 const Put = "http://localhost:5001/Update/";
const Delete = "http://localhost:5001/Delete/";

 class BookServices extends Component {

     GetAll(){
        const result = axios.get(Get);
        return result;
    }


    CreateBook(lib){
         axios.post(Post, lib);
        
    }

    UpdateBook(bookId, lib){
        axios.put(Put + bookId, lib);  
        
    }

    DeleteBook(bookId){
        axios.delete(Delete + bookId)
    }




  render() {
    return (
      <div>
        
      </div>
    )
  }
}

export default new  BookServices();