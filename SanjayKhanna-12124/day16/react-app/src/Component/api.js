import { useEffect, useState } from 'react';

 export const Api = () => {
    const [data, setData] = useState([]);

    useEffect(()=>{
        fetch('https://jsonplaceholder.typicode.com/posts')
        .then((res)=>res.json())
        .then((data)=>{
            console.log(data);
            setData(data);
        })
        .catch((e)=>{console.log(e.message)});
    },[]);

    return(
        <div> <ul>
        {data.map((item) => (<li key={item.id}>{item.title}</li>))}
    </ul>
    </div>
    )
}

