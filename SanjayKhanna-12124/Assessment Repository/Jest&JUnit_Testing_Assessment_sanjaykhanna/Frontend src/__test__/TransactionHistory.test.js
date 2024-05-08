import '@testing-library/jest-dom';
import { render, screen } from '@testing-library/react';
import renderer from 'react-test-renderer';
import TransactionHistory from '../Components/MainComponents/TransactionHistory';
import { doGetAllTransaction } from '../Components/Services/Services';

describe('Checking Transaction History Page', () => {

    test('should render the Transaction History Page', () => {
        render(<TransactionHistory />)
        expect(screen.getByText("History Of Transaction")).toBeInTheDocument();
    });

    test('should check rendering the table', () => {
        render(<TransactionHistory />)
        expect(screen.getByTestId("historyTable")).toBeDefined();
    });

    test('should return history of transaction list', () => {
        const result = doGetAllTransaction();
        expect(result).toBeDefined();
        result.then(res => {
            expect(res.status).toEqual(200);
            expect(res.data).toEqual([]);
        });
    });

    test('Snapshot Testing for History Page', () => {
        expect(renderer.create(<TransactionHistory />).toJSON()).toMatchSnapshot();
    });
});
