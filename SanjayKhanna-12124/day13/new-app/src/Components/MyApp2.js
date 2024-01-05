import React from 'react';

function MyApp2(props) {
    return (
        <div>
        <p><i>This is My First Component {props.name} using {props.topic}</i></p>
        {props.children}
        </div>
    );
}

export default MyApp2;
