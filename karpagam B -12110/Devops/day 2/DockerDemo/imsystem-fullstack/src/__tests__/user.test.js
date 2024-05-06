import { fireEvent, render, screen } from "@testing-library/react";
import AddUser from '../pages/AddUser';
import PetHome from '../index/PetHome';
import UserHome from "../index/UserHome";

import "@testing-library/jest-dom";
jest.mock("react-router-dom");

describe('Test suite for second user story user home page', () => {

    //book pet navigate link
    test("book pet 'navigate link' ",() => {
        render(<UserHome/>);
        const userElement = screen.getByRole("bookpetslink");
        expect(userElement).toBeInTheDocument();
    });

    
    //petName search box
    it("renders 'user serch for petName' ", () => {
        render(<PetHome />);
        const linkElement = screen.getByRole("searchbox");
        expect(linkElement).toBeInTheDocument();
    });


    // //render book appointment page text
    it("render 'User book appointment' ",async () => {
        render(<AddUser />);
        const linkElement = screen.getByText(/BOOK APPOINTMENT/i);
        expect(linkElement).toBeInTheDocument();
    });


    //Book pets - user name
    it("render 'user name label' ", () => {
        render(<AddUser />);
        const linkElement = screen.getByRole("labelusername");
        expect(linkElement).toBeInTheDocument();
    });

    //Book pet - user name Input
    it("render 'input user name' ", () => {
        render(<AddUser/>);
        const linkElement = screen.getByRole("usrname");
        expect(linkElement).toBeInTheDocument();
        expect(linkElement).toHaveTextContent("");

    });

    //Book pets - user city
    it("render 'user city label' ", () => {
        render(<AddUser />);
        const linkElement = screen.getByRole("labelusercity");
        expect(linkElement).toBeInTheDocument();
    });

    //Book pet - user city Input
    it("render 'input user city' ", () => {
        render(<AddUser />);
        const linkElement = screen.getByRole("usrcity");
        expect(linkElement).toBeInTheDocument();
        expect(linkElement).toHaveTextContent("");

    });

    //Book pets - user age
    it("render 'user age label' ", () => {
        render(<AddUser />);
        const linkElement = screen.getByRole("labeluserage");
        expect(linkElement).toBeInTheDocument();
    });

    //Book pet - user age Input
    it("render 'input user age' ", () => {
        render(<AddUser />);
        const linkElement = screen.getByRole("usrage");
        expect(linkElement).toBeInTheDocument();
        expect(linkElement).toHaveTextContent("");

    });

    //Book pets - pet Id
    it("render 'pet id label' ", () => {
        render(<AddUser />);
        const linkElement = screen.getByRole("labelpetId");
        expect(linkElement).toBeInTheDocument();
    });


    //user submit button
    it("renders 'user insert submit button' ", () => {
        render(<AddUser />);
        const linkElement = screen.getByTestId("user-submit");
        expect(linkElement).toBeInTheDocument();
        expect(linkElement).toHaveTextContent("SUBMIT");
    });

     //fireevent-Book Appointment- for user name
     it("tests the User name event",async() => {
        render(<AddUser placeholder='Enter User Name' />)
        const input = screen.getByPlaceholderText('Enter User Name')
        const value = 'kavi'
        fireEvent.change(input, {
            target: {
                value
            }
        })
        expect(input).toHaveValue('kavi');
    })

     //fireevent-Book Appointment- for user city
     it("tests the user city event",async() => {
        render(<AddUser placeholder='Enter User city' />)
        const input = screen.getByPlaceholderText('Enter User city')
        const value = 'chennai'
        fireEvent.change(input, {
            target: {
                value
            }
        })
        expect(input).toHaveValue('chennai');
    })

    //fireevent-Book Appointment- for user age
    it("tests the user age event",async() => {
        render(<AddUser placeholder='Enter User Age' />)
        const input = screen.getByPlaceholderText('Enter User Age')
        const value = '24'
        fireEvent.change(input, {
            target: {
                value
            }
        })
        expect(input).toHaveValue('24');
    })


});
