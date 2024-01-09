import React, { useState } from 'react'

function ValidationForm() {
    const [inputFields,setinputFields]=useState({
        mail:"",
        password: "",
        age:null
    })

    const [error,setError]=useState({});
    const[submitting,setSubmitting]=useState(false);

    let validate=(inpvalues)=>{
        let error={};
        let mailpat = /^[a-zA-Z0-9]+@[a-zA-Z0-9]+\.[A-Za-z]+$/;
      let passPat = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()\-+.]).{6,20}$/ ;
        if (!mailpat.test(inpvalues.mail)) {
            error.mail = true;
        } if(!passPat.test(inpvalues.password)){
            error.password= true;
        }
        if(inputFields.age < 18)
        error.age="Too young";
        return error;
    };

    let handleChange = (e)=>{
        setinputFields(
            {...inputFields,
                [e.target.name]: e.target.value});
    };

    let handleSubmit=(e)=>{
        e.preventDefault();
        setError(validate(inputFields));
        setSubmitting(true);
    };
  return (
    <div>
      <form action="" onSubmit={handleSubmit}>
        <div>
          <label htmlFor="email">
            Email address:
            <input
              type="email"
              name="mail"
              id="mail"
              value={inputFields.mail}
              onChange={handleChange}
            />
          </label>
          <br />
          <br />
        </div>
        <div>
          <label htmlFor="password">
            Password :
            <input
              type="password"
              name="password"
              id="password"
              value={inputFields.password}
              onChange={handleChange}
            />
          </label>
        </div>
        <div>
          <label htmlFor="age">
            Age:
            <input
              type="number"
              name="age"
              id="age"
              value={inputFields.age}
              onChange={handleChange}
            />
          </label>
        </div>
        <button type="submit">Submit Information</button>
      </form>
      {error.mail ? <p className="error">email atleast 15 character</p> : null}
      {error.password ? <p className="error">password atleast 5</p> : null}
      {error.age ? <p className="error">age above 18</p> : null}
      {Object.keys(error).length === 0 && submitting ? (
        <span className="bg-success success rounded mt-5">Successfully submitted</span>
      ) : null}
    </div>
  );
}

export default ValidationForm
