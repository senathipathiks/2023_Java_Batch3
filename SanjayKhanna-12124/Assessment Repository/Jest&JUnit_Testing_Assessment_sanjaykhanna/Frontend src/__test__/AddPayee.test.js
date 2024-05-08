import '@testing-library/jest-dom';
import { render, screen } from '@testing-library/react';
import AddPayee from '../Components/MainComponents/AddPayee';
import { doAdd } from '../Components/Services/Services';

const Flags = {
    isAddable: true,
}

describe('Checking Add page is Rendering', () => {

    test('Should have add fields', () => {
        render(<AddPayee Flags={Flags} />)
        expect(screen.getByLabelText("Full Name")).toBeInTheDocument();
        expect(screen.getByLabelText("Nick Name")).toBeInTheDocument();
        expect(screen.getByLabelText("Account Number")).toBeInTheDocument();
    })
    

    test('should insert the data with mock data', () => {
        const mockData = {
            payeeId: 11,
            payeeName: "Test010",
            nickName: "Test010",
            account: {
                accountNumber: "1234567821",
            }
        }
        const result = doAdd(mockData);
        expect(result).toBeDefined();
        result.then(res => {
            expect(res.status).toEqual(200);
            expect(res.data).toEqual("success");
        });

    });


});
