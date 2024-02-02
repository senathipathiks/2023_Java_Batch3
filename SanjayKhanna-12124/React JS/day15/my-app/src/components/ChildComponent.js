import React from 'react';

function ChildComponent({name}) {
    console.log("Child Component is Rendering")
    return (
        <div>
        <h2>{name}</h2>
        </div>
    );
}

export default React.memo(ChildComponent);
