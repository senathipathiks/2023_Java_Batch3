// import { render, screen } from '@testing-library/react';
import App from './App';
import renderer from 'react-test-renderer';

describe('Test suite for App',()=>{

  test("Snapshot test",()=>{
    const comp=renderer.create(<App/>)
    const tree=comp.toJSON();
    expect(tree).toMatchSnapshot();
  })




  // test('renders learn react link', () => {
  //   render(<App />);
  //   const linkElement = screen.getByText("Welcome to my page!!");
  //   expect(linkElement).toBeInTheDocument();
  // });

  // it('renders Welcome to relevantz', () => {
  //   render(<App />);
  //   const linkElement = screen.getByText("Hi Welcome to relevantz");
  //   expect(linkElement).toBeInTheDocument();
  // });

  // it('renders Welcome to jest', () => {
  //   render(<App />);
  //   const linkElement = screen.getByText("Hello Welcome to jest");
  //   expect(linkElement).toBeInTheDocument();
  // });
});


