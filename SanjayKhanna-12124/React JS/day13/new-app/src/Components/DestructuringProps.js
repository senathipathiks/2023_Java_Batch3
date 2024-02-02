import React from 'react';

function DestructuringProps(prop) {
    const {name,topic} = prop
    return (
        <div>
        This is My First Component {name} using {topic}
        </div>
    );
    }

export default DestructuringProps;
