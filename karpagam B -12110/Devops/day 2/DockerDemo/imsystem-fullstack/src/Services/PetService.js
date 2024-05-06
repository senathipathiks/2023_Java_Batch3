import { Component } from "react";
import axios from "axios";

const GET = "http://localhost:8080/getAllPetList";
const savePet = "http://localhost:8080/doPetInsert";
const FetchId = "http://localhost:8080/GetPetId/";
const GetIdList = "http://localhost:8080/getPetIdList";

const fetchByName = "http://localhost:8080/findByPetName/{petName}";

class PetService extends Component {
    getPets() {
        return axios.get(GET);
      }
      AddPet(pet) {
        return axios.post(savePet,pet);
      }
      fetchPetById(petId) {
        return axios.get(FetchId + petId);
      }
     
      fetchByName(petName) {
        return axios.get(fetchByName + petName);
      }                              
     
      getAllIdList() {
        return axios.get(GetIdList);
      }
}
export default new PetService()
