import '@testing-library/jest-dom';
import { render, screen } from '@testing-library/react';
import DeletePayee from '../Components/MainComponents/DeletePayee';
import { doDelete } from '../Components/Services/Services';

const Flags = {
    isDeletable: true
}

describe('Checking the Delete page components', () => {

    test('should render the delete page', () => {
        render(<DeletePayee Flags={Flags} id={1} />);
        expect(screen.getByText("Are you confirm to delete ?")).toBeInTheDocument();
    });

    test('should have the Button and Content', () => {
        render(<DeletePayee Flags={Flags} id={1} />);
        expect(screen.getByTestId("warning")).toBeInTheDocument();
        expect(screen.getByTestId("confirmBtn")).toBeInTheDocument();
        expect(screen.getByTestId("cancelBtn")).toBeInTheDocument();
    });

    test('should delete a payee data', () => {
        const result = doDelete(22);
        expect(result).toBeDefined();
        result.then((res) => {
            expect(res.data).toEqual("success");
            expect(res.status).toEqual(200);
        })
    });



});
