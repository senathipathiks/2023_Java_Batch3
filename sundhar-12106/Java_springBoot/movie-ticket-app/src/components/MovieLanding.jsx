import React, { useState } from "react";
import movies from "../movies.json";
import screen from "../Screens.json";
import "../App.css";

const MovieLanding = () => {
  const [selectedMovie, setSeletedMovie] = useState(null);
  const [selectedScreen, setSeletedScreen] = useState(null);
  const [selectedSeats, setSeletedSeats] = useState([]);

  const [seat, setSeat] = useState("available");

  //   console.log(selectedMovie);

  const handleSelect = (index, screen) => {
    if (screen?.id !== selectedScreen?.id) {
      setSeletedSeats(index);
      console.log("hello " + index);
      setSeletedScreen(screen);
    } else {
      selectedScreen(screen);
      if (selectedSeats.includes(index)) {
        setSeletedSeats(selectedSeats.filter((i) => i !== index));
      } else {
        setSeletedSeats((seats) => [...seats, index]);
      }
    }
  };

  return (
    <div className="container">
      <h3 className="text-center">Movie Ticket Booking</h3>
      <h5 className="text-center">Choose your movie :</h5>
      <div className="conatiner justify-content-around  d-flex flex-wrap ">
        {movies.map((movie) => (
          <div
            className=" mt-3 frame border border-black rounded"
            key={movie.id}
            onClick={() => {
              setSeletedMovie(movie);
            }}
          >
            <img className="rounded" src={movie.image} alt={movie.title} />
            <div className="text-center">
              <span className="fw-medium ">{movie.title}</span>
            </div>
          </div>
        ))}
      </div>
      {/* Display selected movie details */ console.log(selectedMovie)}
      {selectedMovie ? (
        <>
          <hr />
          <h4 className="mt-2">choose screen : </h4>
          <div className="screen-selection">
            {screen.map((screens) => (
              <div
                className={`screen ${
                  screen.id === selectedScreen?.id ? "selected" : ""
                }${screens.seats.includes(1) ? " available" : ""}`}
                key={screen.id}
              >
                <div className="screen-number mb-2 ">
                  <span>screen : {screens.id}</span>
                </div>
                <div className="screen-time mb-2">
                  <span>screen time : {screens.time}</span>
                </div>
                <div className="movie-title">
                  <span className="fw-bolder">{selectedMovie.title}</span>
                </div>
                <div className="screen-seats">
                  {screens.seats.map((item, index) => {
                    console.log(index);
                    return (
                      // eslint-disable-next-line react/no-array-index-key
                      <div
                        key={index}
                        className={`seat ${item ? "available" : "unavailable"}${
                            selectedSeats.includes(index)
                             &&
                          selectedScreen?.id === screens.id ? "selected" : ""
                        }
                    ${selectedSeats.includes(index) ? "booked" : ""}
                    `}
                        onClick={() => {
                          console.log(seat);
                          console.log(selectedSeats);
                          if (item) {
                            handleSelect(index, {
                              ...screens,
                              movies: selectedMovie,
                            });
                          }
                        }}
                      >
                        <div className="seat-no ">{index + 1}</div>
                      </div>
                    );
                  })}
                </div>
              </div>
            ))}
          </div>
        </>
      ) : null}
    </div>
  );
};

export default MovieLanding;
