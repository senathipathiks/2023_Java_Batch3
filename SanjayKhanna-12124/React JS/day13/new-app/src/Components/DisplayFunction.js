import React, { useState } from 'react';

function DisplayFunction() {
    var [str, setWord] = useState("Welcome all");
    return (
        <div>
            {str}
        <button onClick={()=>{setWord(str="Thank your for Subscribing")}}>Subscribe</button>
        </div>
    );
}

export default DisplayFunction;
