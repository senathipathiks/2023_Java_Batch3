import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router';
import RestaurantService from './RestaurantService';

const UpdateRestaurant = () => {

    const navigate = useNavigate();
    const {rid}=useParams();
    const [res, setRes] = useState({
        rname: " ",
        rcity:" "       
    })

    const { rname,rcity } = res;
    const passToUpdate=(e) => {
        e.preventDefault();   
         
        const restaurantDetails={rid,rname,rcity} 
        console.log(restaurantDetails);
        RestaurantService.updateRestaurant(restaurantDetails).then((response) => {
            console.log(response.data);
          alert(" Restaurant Updated")
            navigate('/restaurantHome')
        }).catch((error) => {
                console.log("error")
        })
    }
    

    useEffect(()=>{
        RestaurantService.findResDetails(rid).then((response)=>{
            console.log(response.data);
            setRes(response.data);
        })
    },[])



  return (
    <div>
      <div>
        
        <div className='container ' style={{marginTop:"10%"}}>
          <h1>UPDATE RESTAURANT</h1>
          <div style={{height:'10px',width:'70%',marginLeft:'170px',marginTop:'50px'}}>
          <form onSubmit= {(e)=>passToUpdate(e)}>
  
         
          
         
         
         <div className="form-floating mb-3">
                                <input type="text" className="form-control" id="floatingPassword"  placeholder="Restaurant Id" required name='Restaurant Id' value={rid} 
                               />
                                <label htmlFor="floatingPassword">Restaurant  Id</label>
                            </div>
                            <div className="form-floating mb-3">
                                <input type="text" className="form-control" id="floatingPassword"  placeholder="Restaurant Name" required  value={res.rname}
                               name='rname'
                               onChange={(e) => setRes({ ...res, [e.target.name]: e.target.value })} />
                                <label htmlFor="floatingPassword">Restaurant  Name</label>
                            </div>
                            <div className="form-floating mb-3">
                                <input type="text" className="form-control" id="floatingPassword"  placeholder="Restaurant Name" required  
                               value={res.rcity} name='rcity'
                               onChange={(e) => setRes({ ...res, [e.target.name]: e.target.value })} />
                                <label htmlFor="floatingPassword">Restaurant  Name</label>
                            </div>

          
         
          <br></br>
          <br></br>
          <input type='submit'  class="btn btn-primary" value='Update' />        </form>
        </div>
        </div>
      </div>
    </div>
  )
}

export default UpdateRestaurant
