import React, { useState } from 'react'
const Games = [
    "Cricket",
    "Basket ball" ,
    "Hockey",
    "Football",
    "Tennis",
    "Ball Badmiton"
]

const User = () => { // default
    const [enteredPlayerName, setEnteredPlayerName] = useState("");
    const [enteredAge, setEnteredAge] = useState("");
    const[selectGames, setSelectGames] = useState(" ");
    
    const playerNamechangehandler = (e) => {
        setEnteredPlayerName(e.target.value);
    };

    const agechangehandler = (e) => {
        setEnteredAge(e.target.value);
    };

    const gamesddhandler = (e) => {
        setSelectGames(e.target.value);
    };

    const submithandler = (e) => {
        e.preventDefault ();
    

    const user = {
        player : enteredPlayerName,
        age: enteredAge,
        game: selectGames
    };

    alert (JSON.stringify(user));

}
  return (
    <div>
      <form onSubmit={submithandler}>
        <label htmlFor='player'>Player</label>
        <input id='sportman' 
        type='text' 
        value={enteredPlayerName} 
        onChange={playerNamechangehandler}>     
        </input>

        <br></br>

        <label htmlFor='age'>Age (years)</label>
        <input id='age' 
        type='number' 
        value={enteredAge} 
        onChange={agechangehandler}>     
        </input>

        <br></br>

        <label htmlFor='games'>Sport</label>
        <select id='games'  
        value={selectGames} 
        onChange={gamesddhandler}>  
         {Games.map((item, idx) => (
            <option key={idx} value={item}> {item} </option>
         ) ) }   
        </select>

        <br></br>
        <button type='Submit'>Add player</button>
      </form>
    </div>
  );
}


export default User
