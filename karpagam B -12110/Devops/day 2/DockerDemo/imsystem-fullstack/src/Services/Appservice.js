import React, { Component } from "react";
import axios from "axios";
const GET = "http://localhost:8080/getAllAppList";
const SAVE = "http://localhost:8080/doAppInsert";
const FetchId = "http://localhost:8080/GetAppId/";
const GetIdList = "http://localhost:8080/getAppIdList";


class Appservice extends Component {
    getApps() {
        return axios.get(GET);
      }
      saveApp(app) {
        return axios.post(SAVE, app);
      }
      fetchApById(appId) {
        return axios.get(FetchId + appId);
      }
                                
     
      getAppIdList() {
        return axios.get(GetIdList);
      }
}
export default new Appservice()
