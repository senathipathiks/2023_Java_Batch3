import React, { Component } from "react";
import axios from "axios";
const GET = "http://localhost:8080/getAllPackageDetailsList";
const SAVE = "http://localhost:8080/doPackageDetailsInsert";
const FetchId = "http://localhost:8080/GetId/";
const GetIdList = "http://localhost:8080/getPackageDetailsIdList";


class TourService extends Component {
    getPackages() {
        return axios.get(GET);
      }
      savePackage(app) {
        return axios.post(SAVE, app);
      }
      fetchPackage(packageId) {
        return axios.get(FetchId + packageId);
      }
                                
     
      getPackageIdList() {
        return axios.get(GetIdList);
      }
}
export default new TourService()
