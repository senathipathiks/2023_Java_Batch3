import { fireEvent, render, screen } from "@testing-library/react";
import AddPet from   '../pages/AddPet';
import PetHome from  "../index/PetHome";

import "@testing-library/jest-dom";
jest.mock("react-router-dom");

describe('Test suite for first user story pet home page', () => {


     //Pet home page text verify
     test("render 'Pet Home' ", () => {
        render(<PetHome/>);
        const linkElement = screen.getByText(/ONLINE PET SHOP/i);
        expect(linkElement).toBeInTheDocument();
    });



    //insert pet page navigate link
    test("insert pet 'navigate link' ", () => {
        render(<PetHome />);
        const userElement = screen.getByRole("insertpetlink");
        expect(userElement).toBeInTheDocument();
    });


    //User page navigate link
    test("user 'navigate link' ", () => {
        render(<PetHome />);
        const userElement = screen.getByRole("userlink");
        expect(userElement).toBeInTheDocument();
    });

    //appointment page navigate link
    test("appointment 'navigate link' ", () => {
        render(<PetHome />);
        const userElement = screen.getByRole("applink");
        expect(userElement).toBeInTheDocument();
    });

    //Insert pet - Petname Label
    it("render 'pet name label' ", () => {
        render(<AddPet/>);
        const linkElement = screen.getByRole("petlabel");
        expect(linkElement).toBeInTheDocument();
    });

    //Insert pet - Petname Input
    it("render ' input Pet name' ", () => {
        render(<AddPet />);
        const linkElement = screen.getByRole("ptname");
        expect(linkElement).toBeInTheDocument();
        expect(linkElement).toHaveTextContent("");
    });

    //Insert pet - PetType Label
    it("render 'pet type label' ", () => {
        render(<AddPet />);
        const linkElement = screen.getByRole("typelabel");
        expect(linkElement).toBeInTheDocument();
    });

    //Insert pet - PetType Input
    it("render ' input Pet type' ", () => {
        render(<AddPet />);
        const linkElement = screen.getByRole("pttype");
        expect(linkElement).toBeInTheDocument();
        expect(linkElement).toHaveTextContent("");
    });

    //Insert pet - PetAge Label
    it("render 'pet age label' ", () => {
        render(<AddPet />);
        const linkElement = screen.getByRole("agelabel");
        expect(linkElement).toBeInTheDocument();
    });

    //Insert pet - PetAge Input
    it("render ' input Pet age' ", () => {
        render(<AddPet />);
        const linkElement = screen.getByRole("ptage");
        expect(linkElement).toBeInTheDocument();
        expect(linkElement).toHaveTextContent("");

    });

    //Insert pet - PetWeight Label
    it("render 'pet weight label' ", () => {
        render(<AddPet />);
        const linkElement = screen.getByRole("weightlabel");
        expect(linkElement).toBeInTheDocument();
    });

    //Insert pet - PetWeight Input
    it("render ' input Pet weight' ", () => {
        render(<AddPet />);
        const linkElement = screen.getByRole("ptweight");
        expect(linkElement).toBeInTheDocument();
        expect(linkElement).toHaveTextContent("");

    });

    //Insert pet - PetPrice Label
    it("render 'pet price label' ", () => {
        render(<AddPet />);
        const linkElement = screen.getByRole("pricelabel");
        expect(linkElement).toBeInTheDocument();
    });

    //Insert pet - PetPrice Input
    it("render 'input Pet price' ", () => {
        render(<AddPet />);
        const linkElement = screen.getByRole("ptprice");
        expect(linkElement).toBeInTheDocument();
        expect(linkElement).toHaveTextContent("");

    });

    //pet submit button
    it("renders 'pet insert submit button' ", () => {
        render(<AddPet />);
        const linkElement = screen.getByTestId("pet-submit");
        expect(linkElement).toBeInTheDocument();
        expect(linkElement).toHaveTextContent("SUBMIT");

    });

     //fireevent -Insert pet-for pet Name
     it("tests the petName event", async () => {
        render(<AddPet placeholder='Enter Pet Name' />)
        const input = screen.getByPlaceholderText('Enter Pet Name')
        const value = 'charlie'
        fireEvent.change(input, {
            target: {
                value
            }
        })
        expect(input).toHaveValue('charlie');
    })

    //fireevent-Insert pet- for pet type
    it("tests the petType event", async () => {
        render(<AddPet placeholder='Enter Pet type' />)
        const input = screen.getByPlaceholderText('Enter Pet type')
        const value = 'cat'
        fireEvent.change(input, {
            target: {
                value
            }
        })
        expect(input).toHaveValue('cat');
    })

    //fireevent -Insert pet-for pet age
    it("tests the petAge event", async () => {
        render(<AddPet placeholder='Enter Pet Age' />)
        const input = screen.getByPlaceholderText('Enter Pet Age')
        const value = '2'
        fireEvent.change(input, {
            target: {
                value
            }
        })
        expect(input).toHaveValue('2');
    })

     //fireevent-Insert pet- for pet weight
     it("tests the petWeight event",async() => {
        render(<AddPet placeholder='Enter Pet Weight' />)
        const input = screen.getByPlaceholderText('Enter Pet Weight')
        const value = '7kg'
        fireEvent.change(input, {
            target: {
                value
            }
        })
        expect(input).toHaveValue('7kg');
    })

     //fireevent-Insert pet- for pet price
     it("tests the petPrice event",async() => {
        render(<AddPet placeholder='Enter Pet Price' />)
        const input = screen.getByPlaceholderText('Enter Pet Price')
        const value = '20000'
        fireEvent.change(input, {
            target: {
                value
            }
        })
        expect(input).toHaveValue('20000');
    })




});
