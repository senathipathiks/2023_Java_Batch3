// import React from "react";
import { connect } from "react-redux";
import CounderRedux from "./Component";

let mapStateProp = state => {
  return {
    count: state,
  };
};

let mapDispatchToProp = (dispatch) => {
  return {
    handleIncrement: () => dispatch({ type: "INCREMENT" }),
    handleDecrement: () => dispatch({ type: "DECREMENT" }),
  };
};

export default connect(mapStateProp, mapDispatchToProp)(CounderRedux);