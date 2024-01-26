import React from 'react';
import { ReactDOM } from 'react-dom/client';

const myArray = [apple,banana,graps];

const MyList = myArray.map((item) => <p>{item}</p>);

const container = document.getElementById("root");
const root = ReactDOM.createRoot(container);
root.render(MyList);


