import React, { useState } from 'react';

const Welcome = () => {
 const [isSubscribed, setIsSubscribed] = useState(false);

 const handleSubscribe = () => {
    setIsSubscribed(true);
 };

 return (
    <div>
      {isSubscribed ? (
        <h1>Welcome all!</h1>
      ) : (
        <button onClick={handleSubscribe}>Subscribe</button>
      )}
    </div>
 );
};

export default Welcome;