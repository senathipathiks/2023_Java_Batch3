import renderer from 'react-test-renderer';
import App from './App';

// describe('Test Suite for App',()=>{
//   test('renders learn react line 1', () => {
//     render(<App />);
//     const linkElement = screen.getByText("Welcome to my page");
//     expect(linkElement).toBeInTheDocument();
//   });
//   test('renders learn react line 2', () => {
//     render(<App />);
//     const linkElement = screen.getByText("This is Sanjay khanna");
//   expect(linkElement).toBeInTheDocument();
//   });
//   test('renders learn react line 3', () => {
//     render(<App />);
//     const linkElement = screen.getByText("Software Trainee Engineer");
//     expect(linkElement).toBeInTheDocument();
//   });
// })

test('Snapshot Testing', () => {
  const comp = renderer.create(<App />).toJSON();
  expect(comp).toMatchSnapshot();
});

