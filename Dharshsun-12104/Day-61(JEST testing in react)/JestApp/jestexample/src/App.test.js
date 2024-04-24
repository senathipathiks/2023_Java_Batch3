import { render, screen } from '@testing-library/react';
import App from './App';
import renderer from 'react-test-renderer';

describe('Test Suite for app',()=>{
// test.skip('renders learn react link', () => {
//   render(<App/>);
//   const linkElement = screen.getByText("Welcome to my page");
//   expect(linkElement).toBeInTheDocument();
// });
// test('renders welcome to Relevantz',()=>{
//   render(<App/>);
//   const linkElement = screen.getByText("Hi welcome to Relevantz");
//   expect(linkElement).toBeInTheDocument();
// });
test("Snapshot test",() => {
  const comp = renderer.create(<App/>)
  const tree = comp.toJSON();
  expect(tree).toMatchSnapshot();
});
})
// test('two_plus_two',()=>{
//   expect(2+2).toBe(4);
// })
