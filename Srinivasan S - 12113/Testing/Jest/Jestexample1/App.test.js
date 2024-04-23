import { render, screen } from "@testing-library/react";
import renderer from "react-test-renderer";
import App from "./App";

describe("Test suite for app", () => {
  // test("renders learn react link", () => {
  //   render(<App />);
  //   const linkElement = screen.getByText(/Welcome !!!/i);
  //   expect(linkElement).toBeInTheDocument();
  // });
  // it.skip("renders Hi Relevantz", () => {
  //   render(<App />);
  //   const linkElement = screen.getByText("Hi Relevantz ");
  //   expect(linkElement).toBeInTheDocument();
  // });

  test("renders snapshot", () => {
    const comp = renderer.create(<App />);
    const tree = comp.toJSON();
    expect(tree).toMatchSnapshot();
  });
});
