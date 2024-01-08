import React, { useState } from "react";

function Form() {
  //     let [username,setUsername] = useState('')
  //     let [comment,setComment]=useState('')

  //    let valid = (e)=>{
  //         e.preventDefault();
  //         (!isNaN(username) && username.length === "")?console.log("enter valid value"+isNaN(username)):alert("do you want to submit"+username);
  //     }

  let [firstname, setFirstname] = useState("");
  let [lastname, setLastname] = useState("");
  let [mail, setMail] = useState("");
  let [password, setPassword] = useState("");

  let [disp,setDisp]=useState("d-none");

  let fname=(e)=>{
    setFirstname(e.target.value)
  }

  let lname = (e) => {
    setLastname(e.target.value);
  };

  let handleMail=(e)=>{
    setMail(e.target.value)
  }

  let Handlepassword=(e)=>{
    setPassword(e.target.value)
  }

  let valid= (e)=>{
      e.preventDefault();
      let mailpat = /^(([^<>()[\],;:\s@"]+(\.[^<>()[\],;:\s@"]+)*)|(".+"))@(([^<>()[]\.,;:\s@"]+\.)+[^<>()[\].,;:\s@"]{6,})$/;
      let passPat = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()\-+.]).{6,20}$/ ;

      if(firstname === "" || lastname === ''||mail === ''||password===''){
        alert("All fields are required");
        }else if(!isNaN(firstname)||!isNaN(lastname)){
          alert("Name field should be text");
          console.log(!isNaN(firstname)+":"+!isNaN(lastname));
        }else if(!mailpat.test(mail)){
          console.log("mail" + mailpat.test(mail));
          alert("Enter mail-id is invalid..!")
        }else if(!password.match(passPat)){
          alert("please eneter strong password")
        }else{
          setDisp('');
        }
  }

  return (
    <div>
      <div className="container d-flex  align-items-center justify-content-center p-5 ">
        <form action="" className="p-5 border">
          <h2 className="text-primary text-center ">Registeration</h2>
          <label htmlFor="fname" className="mt-2 ">
            first name
            <input
              className="m-2"
              id="fname"
              type="text"
              value={firstname}
              onChange={fname}
            />
          </label>
          <br />
          <label htmlFor="lname" className="mt-2 ">
            last name
            <input
              className="m-2"
              id="lname"
              type="text"
              value={lastname}
              onChange={lname}
            />
          </label>
          <br />
          <label htmlFor="mail" className="mt-2 ">
            enter mail
            <input
              className="m-2"
              type="email"
              name="mail"
              id="mail"
              value={mail}
              onChange={handleMail}
            />
          </label>
          <br />
          <label htmlFor="pass" className="mt-2 ">
            password
            <input
              className="m-2"
              type="password"
              id="pass"
              value={password}
              onChange={Handlepassword}
            />
          </label>{" "}
          <br />
          <button className="btn btn-primary mx-5" onClick={valid}>
            Register
          </button>
        </form>
      </div>
      <div 
      className={disp} 
      style={{width:'100%',display:"flex",color:"blue",alignItems:'center', justifyContent:'center'}}
      >
        account created successfully...
      </div>
    </div>
  );
}

export default Form;
