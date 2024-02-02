import React from 'react';

function ArrayRendering() {
    const arr = [1,2,3];
    const newArr = arr.map(x => <li>{x}</li>);
    return (
        <div>
        {newArr}
        </div>
    );
}

export default ArrayRendering;
