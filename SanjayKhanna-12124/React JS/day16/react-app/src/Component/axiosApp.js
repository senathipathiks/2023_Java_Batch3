import axios from 'axios';
import { useEffect, useState } from "react";
const AxiosApp = () =>{
    const [data, setData] = useState([]);

    useEffect(()=>{
        axios.get('https://jsonplaceholder.typicode.com/posts')
        .then((response)=>{
            setData(response.data);
        })
    },[]);

    return(
        <div>
        <h1>Axios App</h1>
        <ul>
        {data.map((item, index)=>(
            <li key={index}>{item.title}</li>))}
        </ul>
        </div>
    )
}

export default AxiosApp;