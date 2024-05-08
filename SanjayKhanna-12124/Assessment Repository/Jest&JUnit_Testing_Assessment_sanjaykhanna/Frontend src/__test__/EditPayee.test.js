import '@testing-library/jest-dom';
import { render, screen } from '@testing-library/react';
import EditPayee from '../Components/MainComponents/EditPayee';
import { doGetAllPayee, doUpdate } from '../Components/Services/Services';

const Flags = {
    isEditable: true,
}


describe('Checking Edit page is Rendering', () => {
    test('Should have add fields', () => {
        render(<EditPayee Flags={Flags} id={1} />)
        expect(screen.getByLabelText("Full Name")).toBeInTheDocument();
        expect(screen.getByLabelText("Nick Name")).toBeInTheDocument();
    })

    

    test('should return a payee data', () => {
        const result = doGetAllPayee(10);
        expect(result).toBeDefined();
        result.then(res => {
            expect(res.status).toEqual(200);
            expect(res.data.payeeName).toEqual("Test009");
            expect(res.data.nickName).toEqual("Test009");
        }
        );
    });
    
    test('should update the data with mock data', () => {
        const mockData = {
            payeeId:10,
            payeeName: "Test111",
            nickName: "Test0111",
            account: {
                accountNumber: "1234567888",
            }
        }
        const result = doUpdate(mockData);
        expect(result).toBeDefined();
        result.then(res => {
            expect(res.status).toEqual(200);
            expect(res.data).toEqual("success");
        });
    });
});