import React from "react";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import Container from "react-bootstrap/Container";
import "bootstrap/dist/css/bootstrap.min.css";
import Card from "react-bootstrap/Card";
import Button from "react-bootstrap/Button";
import { TiSocialInstagram } from "react-icons/ti";
import { TiSocialTwitter } from "react-icons/ti";
import { SlSocialYoutube } from "react-icons/sl";

const Home1 = () => {
  return (
    <div>
      <Card className="bg-dark text-white">
        <Card.Img
          src="https://www.easemytrip.com/images/bus-img/Train_OGTag.png"
          alt="Card image"
          id="img"
        />
        <Card.ImgOverlay>
          <Card.Text>
            <br></br>
            <br />
            <br />
            <br />
            <h1 style={{ color: "black" }}>Make a Trip Easier......!</h1>
          </Card.Text>
        </Card.ImgOverlay>
      </Card>
      <Card className="bg-dark text-white">
        <Card.Body id="footer">
          <Container>
            <Row>
              <Col>
                <h3>Contact Us on....</h3>
                <ul
                  style={{
                    listStyle: "none",
                    fontSize: "30px",
                    display: "flex",
                  }}
                >
                  <li>
                    <TiSocialInstagram />
                    <h6>hkl123</h6>
                    <br></br>
                  </li>

                  <li>
                    <TiSocialTwitter />
                    <h6>htlds.twitter.com</h6>
                  </li>
                </ul>
              </Col>
              <Col>
                {" "}
                <h2>Join with us....</h2>
                <br></br>
                <Button variant="outline-primary">sign In</Button>{" "}
                <Button variant="outline-primary">sign Up</Button>{" "}
              </Col>
              <Col>
                <img
                  src="https://sa.adanione.com/-/media/Project/Campaigns/Valentine-s-Day/Train-Booking/TRAIN100/M_Web_landing_page_Train.jpg"
                  style={{ height: "100px", width: "350px" }}
                />
              </Col>
            </Row>
          </Container>
        </Card.Body>
      </Card>
    </div>
  );
};

export default Home1;
