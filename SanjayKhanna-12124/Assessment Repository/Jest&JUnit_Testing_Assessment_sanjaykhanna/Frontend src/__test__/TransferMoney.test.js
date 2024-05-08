import '@testing-library/jest-dom';
import { render, screen } from '@testing-library/react';
import renderer from 'react-test-renderer';
import TransferMoney from '../Components/MainComponents/TransferMoney';
import { doSave } from '../Components/Services/Services';
jest.mock('react-router-dom')

describe('Checking the Transfer Money Component', () => {

    test('should render the Transfer Money Component', () => {
        render(<TransferMoney />)
        const transferMoney = screen.getByText('Enter details to Transfer Money');
        expect(transferMoney).toBeInTheDocument();
    });

    test('should render the Header of transfer money component', () => {
        render(<TransferMoney />)
        expect(screen.getByTestId('transferHeader')).toBeInTheDocument();
        expect(screen.getByTestId('transferHeader')).toHaveTextContent('Enter details to Transfer Money');
    });

    test('should check the field in transfer money component', () => {
        render(<TransferMoney />)
        expect(screen.getByLabelText("amount")).toBeInTheDocument();
        expect(screen.getByLabelText("payeeId")).toBeInTheDocument();
    });

    test('should perform the transfer method', () => {
        const data = {
            amount: 2000,
            payee: {
                payeeId: 10
            }
        }
        const result = doSave(data)
        result.then(res => {
                expect(res.status).toBe(200);
                expect(res.data).toEqual("success");
                })
            .catch(err => {
                console.log(err)
            })
    });


    test('should render the Transfer Money Component', () => {
        expect(renderer.create(<TransferMoney />).toJSON()).toMatchSnapshot();
    });
});
