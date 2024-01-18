import { BrowserRouter } from "react-router-dom";
import React, { useEffect, useState } from 'react';
// Components
const Home = () => {
    const [data, setData] = useState([]);

    useEffect(() => {
      fetch('https://example.com/api/data')
        .then(res => res.json())
        .then(data => setData(data));
    }, []);

    return (
      <div>
        <h1>Home</h1>
        <ul>
          {data.map(item => <li key={item.id}>{item.name}</li>)}
          </ul>
          </div>
          );
          };