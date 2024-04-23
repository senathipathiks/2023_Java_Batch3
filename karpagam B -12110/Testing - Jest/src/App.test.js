import { render, screen } from '@testing-library/react';
import App from './App';
import renderer from 'react-test-renderer';

//test suite

describe('Test suite for App', () => {

  //this will create snapshot for the app.js component
  // test('Snapshot test', () => {
  //   const comp = renderer.create(<App/>);
  //   const tree = comp.toJSON();
  //   expect(tree).toMatchSnapshot();
  // });

  test('render hello world', () => {
    render(<App />);
    const linkElement = screen.getByText(/Hello world!!/i);
    //check whether it is available in the web page( learn react)
    expect(linkElement).toBeInTheDocument();
  });


// //either we can use test or it to describe the test cases
  it('renders this is the app created using react', () => {
    render(<App />);
    const linkElement = screen.getByText(/This is the app created using react/i);
    //check whether it is available in the web page( learn react)
    expect(linkElement).toBeInTheDocument();
  });

  it('renders created by kp', () => {
  //   //it will render on virtual dom not on real dom
    render(<App />);
    const linkElement = screen.getByText(/Created by kp !/i);
     //check whether it is available in the web page( learn react)
    expect(linkElement).toBeInTheDocument();
  });

  //failed test case
  //we can use test.skip to skip the test case
  // it('renders created by kp for failed test case', () => {
  //   render(<App />);
  //   const linkElement = screen.getByText("Created by kp");
  //   expect(linkElement).toBeInTheDocument();
  // });

});



