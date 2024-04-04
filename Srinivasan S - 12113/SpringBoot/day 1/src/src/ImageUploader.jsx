import axios from "axios";
import React, { useEffect, useState } from "react";
import { useForm } from "react-hook-form";

const ImageUploader = () => {
  const [images, setImages] = useState([]);

  useEffect(() => {
    axios
      .get("http://localhost:8080/getImages")
      .then((res) => {
        console.log("Image Upload: ", res.data);
        setImages(res.data);
      })
      .catch((err) => {
        console.error("Error getting images", err);
      });
  }, []);

  return (
    <div className="container-fluid ">
      <div className="container border mt-5  p-5 shadow">
        {images.map((image, index) => {
          // console.log(image.imageData);
          return (
            <img
              key={index}
              width="500"
              height="200"
              src={`data:image/jpeg;base64,${image}`}
            />
          );
          // <img width='500' height='200' src={`data:image/png;base64,${this.state.image}>
          //);
        })}
      </div>
      <div>
        {/* <img src={`http://localhost:8080/downloadImage/1.1.PNG`} alt="Image" /> */}
      </div>
    </div>
  );
};

export default ImageUploader;
