import { render, screen } from "@testing-library/react";
import App from "./App";
import renderer from 'react-test-renderer';

// describe("Test Suite for App", () => {
  // test("renders Welcome Vinolisha", () => {
  //   render(<App />);
  //   const linkElement = screen.getByText("Welcome Vinolisha");
  //   expect(linkElement).toBeInTheDocument();
  // });

  // it("renders Welcome to It Company", () => {
  //   render(<App />);
  //   const linkElement = screen.getByText("Welcome to It Company");
  //   expect(linkElement).toBeInTheDocument();
  // });
// });
 
  test('Snapshot Testing', () => {
    const comp = renderer.create(<App />).toJSON();
    expect(comp).toMatchSnapshot();
  });

