import React from 'react';

function MyApp(props) {
    return (
        <div>
        <p><i>This is My First Component {props.name} using {props.topic}</i></p>
        </div>
    );
}

export default MyApp;
