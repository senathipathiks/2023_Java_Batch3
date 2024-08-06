import { useEffect, useRef, useState } from "react";
import AccountCircleIcon from '@mui/icons-material/AccountCircle';
import { NavLink } from "react-router-dom";
import { IoMdJet } from "react-icons/io";
import ViewModuleIcon from '@mui/icons-material/ViewModule';
import ArrowLeftIcon from '@mui/icons-material/ArrowLeft';

const images = [
  "https://1.bp.blogspot.com/-5eofJxD280s/XZrbkthwm2I/AAAAAAAAFZ8/0091rOycXD8nZjuxY6OC7s7LP7syv7_0ACPcBGAYYCw/s1600/rafting.jpg",
  "https://cdn.kimkim.com/files/a/content_articles/featured_photos/6993d173d4b49caed93819ef9e4a366631c6b249/big-b71140ad5f5648cff4aaff46447c003f.jpg",
  "https://www.specialholidays.com/exotic-luxury-holiday/wp-content/uploads/2019/06/luxury-srilanka-small4.jpg"
];
const delay = 2500;

export default function ImageSlid() {
  const [index, setIndex] = useState(0);
  const timeoutRef = useRef(null);

  function resetTimeout() {
    if (timeoutRef.current) {
      clearTimeout(timeoutRef.current);
    }
  }

  useEffect(() => {
    resetTimeout();
    timeoutRef.current = setTimeout(
      () =>
        setIndex((prevIndex) =>
          prevIndex === images.length - 1 ? 0 : prevIndex + 1
        ),
      delay
    );

    return () => {
      resetTimeout();
    };
  }, [index]);

  const win = sessionStorage.getItem("userName");


  const [click, setClick] = useState(false);

  const handleClick = () => setClick(!click);



  return (

    <>    <nav className="navbar">
      <div className="nav-container">
        <NavLink exact to="/" className="nav-logo">
          <span><IoMdJet />  Tourism Management System
          </span>
          <span className="icon">
          </span>
        </NavLink>

        <ul
          className={click ? "nav-menu active" : "nav-menu"}
        >


          <li className="nav-item">
            <NavLink
              exact
              to="/viewtour"
              id="viewbook"
              activeClassName="active"
              className="nav-links"
              onClick={handleClick}
            >
             <ViewModuleIcon/> VIEW TOUR PACKAGES
            </NavLink>
          </li>





          <li className="nav-item">
            <NavLink
              exact
              to="/"
              activeClassName="active"
              className="nav-links"
              onClick={handleClick}
              id="signout"
            >
             <ArrowLeftIcon/> Sign out
            </NavLink>
          </li>


          <li className="nav-item">
            <NavLink
              exact
              activeClassName="active"
              className="nav-links"
              onClick={handleClick}
              to="/userprofile"

            >
              Hi {win} <AccountCircleIcon />
            </NavLink>
          </li>


        </ul>

      </div>
    </nav><br />
      <div className="slideshow">
        <div
          className="slideshowSlider"
          style={{ transform: `translate3d(${-index * 100}%, 0, 0)` }}
        >
          {images.map((image, index) => (
            <div
              className="slide"
              key={index}
              style={{ backgroundImage: `url(${image})` }}
            ></div>
          ))}
        </div>

        <div className="slideshowDots">
          {images.map((_, idx) => (
            <div
              key={idx}
              className={`slideshowDot${index === idx ? " active" : ""}`}
              onClick={() => {
                setIndex(idx);
              }}
            ></div>
          ))}
        </div>
      </div>
    </>
  );
}