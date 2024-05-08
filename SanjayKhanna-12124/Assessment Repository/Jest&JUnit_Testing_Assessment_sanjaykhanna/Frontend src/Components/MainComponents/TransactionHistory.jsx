import React, { useEffect, useState } from 'react';

const services = require('../Services/Services')

const TransactionHistory = () => {
    const [data, setData] = useState([]);
    var count = 1;

    useEffect(() => {
        services.doGetAllTransaction().then((res) => {
            return res.data;
        }).then((resp) => {
            setData(resp)
        }).catch(err => {
            console.log(err)
        })
    }, [])

    return (
        <div>
            <section className="container container-lg">
                <div className="card card-lg mt-5 shadow-lg p-2 mx-auto">
                    <div className="card-header card-title border-0 text-center h1">History Of Transaction</div>
                    <div className="card-body">
                        <div className="container row mt-3">
                            <div className="col-6" style={{ "textAlign": "left" }}>
                            </div>
                        </div>
                        <div className='container'>
                            <table data-testid='historyTable' className="table table-bordered table-striped table-hover mt-3">
                                <thead className="bg-secondary text-white text-center">
                                    <tr>
                                        <td>Transaction Number</td>
                                        <td>Transaction Date<small style={{ fontSize: '12px', marginLeft: '5px' }}>(DD/MM/YYYY)</small></td>
                                        <td>Transaction Time<small style={{ fontSize: '12px', marginLeft: '5px' }}>(hh/mm/ss)</small></td>
                                        <td>Transaction Amount</td>
                                        <td>Account Number</td>
                                        <td>Account Holder</td>
                                        <td>Transaction Status</td>
                                    </tr>
                                </thead>
                                <tbody>
                                    {data &&
                                        data.map((item) => (
                                            <tr key={item.transactionId}>
                                                <td>{count++}</td>
                                                <td>{new Date(item.transactionDate).getDate()}/{new Date(item.transactionDate).getMonth() + 1}/{new Date(item.transactionDate).getFullYear()}</td>
                                                <td>{new Date(item.transactionDate).getHours()}:{new Date(item.transactionDate).getMinutes()}:{new Date(item.transactionDate).getSeconds()}</td>
                                                <td>{item.amount}</td>
                                                <td>{item.payee.account.accountNumber}</td>
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
