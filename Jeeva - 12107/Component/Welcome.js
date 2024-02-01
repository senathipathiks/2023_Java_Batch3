import React from "react";

function Welcome(props){
    const{name, topic} = props
    return (
        <div class = "div1">
            <p>This is a Component {name} created using {topic}</p>
            {props.children}
        </div>
    )
}
export default Welcome