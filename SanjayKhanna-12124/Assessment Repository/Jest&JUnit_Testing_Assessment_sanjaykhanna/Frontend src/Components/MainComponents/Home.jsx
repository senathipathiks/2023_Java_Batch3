import { Button } from '@mui/material';
import React, { useEffect, useState } from 'react';
import { doGetAllPayee } from '../Services/Services';
import Search from '../UtilitiesComponents/Search';
import AddPayee from './AddPayee';
import DeletePayee from './DeletePayee';
import EditPayee from './EditPayee';

const Home = () => {

    const [data, setData] = useState([]);
    const [eId, setEventId] = useState(0);
    const [search, setSearch] = useState("");

    const [Flags, setFlags] = useState({
        isAddable: false,
        isEditable: false,
        isDeletable: false
    });

    useEffect(()=>{
        doGetAllPayee().then(res=>{
            setData(res.data);
        })
        .catch(err=>{
            console.log(err);
        })
    },[])

    return (
        <div>
            <section className="container container-lg">
                <div className="card card-lg mt-5 shadow-lg p-2 mx-auto">
                    <div className="card-header card-title border-0 text-center h1" title='homeHeader' data-testid='homeHeader'>List of Payee</div>
                    <div className="card-body">
                        <div className="container row mt-3">
                            <div className="col-6" style={{ "textAlign": "left" }}>
                                <Button variant="contained" data-testid='addPayee' onClick={() => { setFlags({ isAddable: true }) }} color="success">Add Payee</Button></div>
                            <div className="col-6">
                                <Search search={search} setSearch={setSearch} />
                            </div>
                        </div>
                        <div className='container' title='payeeTable'>
                            <table className="table table-bordered table-striped table-hover text-center mt-3">
                                <thead className="bg-secondary text-white">
                                    <tr>
                                        <td>Payee Name</td>
                                        <td>Nick Name</td>
                                        <td>Account Number</td>
                                        <td className="col-2">Action</td>
                                    </tr>
                                </thead>
                                <tbody>
                                    {
                                        data.filter((st) => st.payeeName.toLowerCase().includes(search) || st.payeeName.toUpperCase().includes(Search)).map((item) => (
                                            <tr key={item.payeeId}>
                                                <td>{item.payeeName}</td>
                                                <td>{item.nickName}</td>
                                                <td>{item.account.accountNumber}</td>
                                                <td className="d-flex justify-content-evenly"><Button variant="contained" onClick={() => { setFlags({isEditable:true});setEventId(item.payeeId)}}>edit</Button><Button variant="contained" color="error" onClick={() => { setFlags({isDeletable:true});setEventId(item.payeeId) }}>delete</Button></td>
                                            </tr>
                                        ))
                                    }
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </section>
            {Flags.isAddable && <AddPayee Flags={Flags} />}
            {Flags.isEditable && <EditPayee Flags={Flags} id={eId} />}
            {Flags.isDeletable && <DeletePayee Flags={Flags} id={eId} />}
        </div>
    );
}

export default Home;
