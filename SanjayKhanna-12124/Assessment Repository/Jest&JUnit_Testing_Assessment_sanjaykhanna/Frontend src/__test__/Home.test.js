import '@testing-library/jest-dom';
import { render, screen } from '@testing-library/react';
import renderer from 'react-test-renderer';
import Home from '../Components/MainComponents/Home';
import { doGetAllPayee } from '../Components/Services/Services';

describe('Checking for Home Page Rendering', () => {

  test('should render home page', () => {
    render(<Home />)
    expect(screen.getByText('List of Payee')).toBeInTheDocument();
  });

  test('should check the header', () => {
    render(<Home />)
    expect(screen.getByTestId('homeHeader')).toBeInTheDocument();
    expect(screen.getByTestId('homeHeader')).toHaveTextContent('List of Payee');
  });

  test('should check rendering the table', () => {
    render(<Home />)
    expect(screen.getByTitle('payeeTable')).toBeInTheDocument();
  });

  test('should return payee list', () => {
    const result = doGetAllPayee();
    expect(result).toBeDefined();
    result.then(res => {
      expect(res.status).toEqual(200);
      expect(res.data).toEqual([]);
    });
  });

  test('Snapshot Testing for Home Page', () => {
    expect(renderer.create(<Home />).toJSON()).toMatchSnapshot();
  });
  

});



