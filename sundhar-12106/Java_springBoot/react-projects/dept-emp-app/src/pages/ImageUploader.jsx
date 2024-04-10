import axios from "axios";
import React, { useEffect, useState } from "react";
import { useForm } from "react-hook-form";

const ImageUploader = () => {
  // const [file1, setFile] = useState(null);
  const { register, handleSubmit } = useForm();

  const [images, setImages] = useState([]);

  useEffect(() => {
    axios
      .get("http://localhost:7890/getImage")
      .then((res) => {
        console.log("Image Upload: ", res.data);
        setImages(res.data);
      })
      .catch((err) => {
        console.error("Error getting images", err);
      });
  }, []);

  const handleUpload = (data) => {
    if (!data) {
      alert("please select a file");
      return;
    }

    const file = new FormData();
    file.append("file", data.file[0]);
    console.log(file);
    axios
      .post("http://localhost:7890/save", file)
      .then((res) => {
        console.log(res.data);
      })
      .catch((err) => {
        console.error(err);
      });
    console.log(file);
  };

  return (
    <div className="container-fluid ">
      <div className="container">
        <h1 className="text-center mt-5">Image Upload</h1>
        <div className="border rounded  shadow p-5">
          <form
            action=""
            className="d-flex gap-5"
            onSubmit={handleSubmit(handleUpload)}
            // encType="multipart/form-data"
          >
            <input
              multiple
              type="file"
              className="form-control w-25 "
              name="file"
              {...register("file")}
              // onChange={(e) => {
              //   setFile(e.target.files[0]);
              // }}
            />
            <input
              type="submit"
              // onClick={handleUpload}
              className="btn btn-primary "
              value="Upload"
            />
          </form>

          <img src={`http://localhost:7890/?id=2`} alt="alterImage" />
        </div>
      </div>

      <div className="container border mt-5  p-5 shadow">
        {images.map((image, index) => {
          console.log(image);
          return (
            <img
              className="ms-2"
              key={index}
              src={`data:image/jpeg;base64,${image}`}
              style={{ width: 200, height: 200 }}
              alt="alterImage"
            />
          );
        })}
      </div>
    </div>
  );
};

export default ImageUploader;
