import axios from "axios";
import React from "react";
import { useEffect } from "react";
import { useState } from "react";

const NewImage = () => {
  let [image, setImage] = useState([]);

  useEffect(() => {
    axios
      .get("http://localhost:8080/FindAll")
      .then((res) => {
        console.log(res);
        setImage(res.data);
      })
      .catch((err) => console.error(err));
  }, []);
  return (
    <div>
      {image.map((image) => (
        <img
          key={image.imageId}
          src={`data:image/jpeg;base64,${image.imageData}`}
          height={400}
          width={500}
          alt=""
        />
      ))}
    </div>
  );
};

export default NewImage;
