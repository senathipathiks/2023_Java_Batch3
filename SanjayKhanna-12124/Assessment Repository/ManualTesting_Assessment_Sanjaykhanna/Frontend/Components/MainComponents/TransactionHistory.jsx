import React, { useEffect, useState } from 'react';
import transactionService from '../../Services/TransactionService';
import Search from '../UtilitiesComponents/Search';

const TransactionHistory = () => {
    const [data, setData] = useState([]);
    const [search, setSearch] = useState("");
    const [count,setCount] = useState(1)

    useEffect(() => {
        transactionService.doGetAll()
            .then((res) => {
                setData(res.data);
            })
            .catch((err) => {
                console.log(err);
            })
    },[])

    return (
        <div>
            <section className="container container-lg">
                <div className="card card-lg mt-5 shadow-lg p-2 mx-auto">
                    <div className="card-header card-title border-0 text-center h1">History Of Transaction</div>
                    <div className="card-body">
                    <div className="container row mt-3">
                            <div className="col-6" style={{ "textAlign": "left" }}>
                                </div>
                            <div className="col-6">
                                <Search search={search} setSearch={setSearch} />
                            </div>
                            </div>
                        <div className='container'>
                            <table className="table table-bordered table-striped table-hover mt-3">
                                <thead className="bg-dark text-white text-center">
                                    <tr>
                                        <td>Transaction Number</td>
                                        <td>Transaction Date</td>
                                        <td>Transaction Amount</td>
                                        <td>Account Number</td>
                                        <td>Account Holder</td>
                                        <td>Transaction Status</td>
                                    </tr>
                                </thead>
                                <tbody>
                                    {
                                        data.filter((st) => st.payee.payeeName.toLowerCase().includes(search) || st.payee.payeeName.toUpperCase().includes(Search)).map((item) => (
                                            <tr key={item.transactionId}>
                                                <td>{count && setCount(count+1)}</td>
                                                <td>{item.transactionDate}</td>
                                                <td>{item.amount}</td>
                                                <td>{item.payee.accountNumber}</td>
                                                <td>{item.payee.payeeName}</td>
                                                <td>{item.status}</td>
                                            </tr>
                                        ))
                                    }
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </section>
        </div>
    );
}

export default TransactionHistory;
