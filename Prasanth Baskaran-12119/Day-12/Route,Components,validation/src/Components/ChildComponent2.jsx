import React from "react";

export default React.memo(function ChildComponent2({ name }) {
  console.log("Child Component is rendered");
  return <div>{name}</div>;
});
