import { Alert, Backdrop, Button, Dialog, DialogActions, DialogContent, DialogTitle, Snackbar, TextField } from "@mui/material";
import axios from 'axios';
import React, { useEffect, useState } from 'react';

function Home() {

    const [booksData, setsBookData] = useState([]);

    const [insertData, setInsertData] = useState({
        bookName: "",
        authorName: "",
        price: 0
    })

    const [editData, setEditData] = useState({
        bookId: 0,
        bookName: "",
        authorName: "",
        price: 0
    })

    const [Flags, setFlags] = useState({
        msg: "",
        isAddable: false,
        isVisible: false,
        isWrongVisible: false,
        isEditable: false,
        isDeletable: false,
        isLoading: false
    });


    useEffect(() => {
        axios.get('http://localhost:1245/library/book/getAllBooks').then((res) => {
            return res.data;
        }).then((resp) => {
            setsBookData(resp)
        }).catch(err => {
            console.log(err)
        })
    }, [])

    const handleEdit = (id) => {
        axios.get('http://localhost:1245/library/book?id=' + id).then((res) => {
            return res.data;
        }).then((resp) => {
            setEditData(resp)
            setInsertData(resp)
            setFlags({ isEditable: true })
        }).catch(err => {
            console.log(err)
        })

    }

    const handleDelete = (id) => {
        setEditData({ bookId: id })
        setFlags({ isDeletable: true })
    }

    const doDelete = () => {
        setFlags({ isDeletable: false, isLoading: true })
        setTimeout(() => {
        axios.delete('http://localhost:1245/library/book?id=' + editData.bookId).then((res) => {
            return res.data;
        }).then((resp) => {
            if (resp === "success")
                setFlags({ isLoading: false, isVisible: true, msg: "Successfully Delete the Book!" })
            else
                setFlags({ isLoading: false, isWrongVisible: true, msg: "Failed to delete the book" })
        }).catch(err => {
            console.log(err)
        })
    },3000)
    }

    const handleInsert = (e) => {
        e.preventDefault()
        setFlags({ isAddable: false, isLoading: true })
        setTimeout(() => {
            axios.post("http://localhost:1245/library/book", {
                ...insertData
            }).then((response) => {
                if (response.data === "success")
                    setFlags({ isLoading: false, isVisible: true, msg: "Successfully added the Book!" })
                else {
                    setFlags({ isLoading: false, isWrongVisible: true, msg: "Failed to add the Book!" });
                }

            })
                .catch((error) => console.log(error))
        }, 3000)
    };


    const handleUpdate = (e) => {
        e.preventDefault()
        setFlags({ isEditable: false, isLoading: true })
        setTimeout(() => {
        axios.put("http://localhost:1245/library/book", {
            ...insertData, bookId: editData.bookId
        }).then((response) => {
            if (response.data === "success")
                setFlags({ isLoading: false, isVisible: true, msg: "Successfully updated the book information." })
            else {
                setFlags({ isLoading: false, isWrongVisible: true, msg: "Failed to update the Book!" });
            }

        })
            .catch((error) => console.log(error))
    },3000)
    };

    return (
        <div>
            <div className='container-fluid container-fluid-fixed-top pt-3'>
                <div className="card card-body w-50 mx-auto text-center  h1" id="title">Library Management System</div>
            </div>
            <section className="container container-lg text-center">
                <div className="card card-lg bg-body mt-5 shadow-lg p-2 mx-auto">
                    <div className="card-title h1">Record List</div>
                    <div className="card-body">
                        <div className="container row">
                            <div className="col-6" style={{ "textAlign": "left" }}>
                                <Button variant="contained" onClick={() => { setFlags({ isAddable: true }) }} color="success">Add Record</Button></div>
                            <div className="col-6" style={{ "textAlign": "right" }}>
                                <h5>No of Record: {booksData.length}</h5>
                            </div>
                        </div>
                        <table className="table table-bordered table-striped table-hover table-lg mt-3">
                            <thead className="bg-dark text-white">
                                <tr>
                                    <td>Book Id</td>
                                    <td>Book Name</td>
                                    <td>Author Name</td>
                                    <td>Price</td>
                                    <td className="col-2">Action</td>
                                </tr>
                            </thead>
                            <tbody>
                                {booksData.map(item => (
                                    <tr key={item.bookId}>
                                        <td>{item.bookId}</td>
                                        <td>{item.bookName}</td>
                                        <td>{item.authorName}</td>
                                        <td>{item.price}</td>
                                        <td className="d-flex justify-content-evenly"><Button variant="contained" onClick={() => { handleEdit(item.bookId) }}>edit</Button><Button variant="contained" color="error" onClick={() => { handleDelete(item.bookId) }}>delete</Button></td>
                                    </tr>
                                ))}
                            </tbody>
                        </table>
                    </div>
                </div>
            </section>

            <Backdrop
                sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1 }}
                open={Flags.isLoading}
            >
                <div class="loader"></div>
            </Backdrop>

            <Dialog
                open={Flags.isAddable}
                onClose={() => setFlags({ isAddable: false })}
                PaperProps={{
                    component: 'form',
                    onSubmit: (e) => handleInsert(e),
                }}
            >
                <DialogTitle className="text-center h2">Enter details to Insert</DialogTitle>
                <DialogContent>
                    <TextField
                        autoFocus
                        required
                        margin="dense"
                        id="bookName"
                        name="bookName"
                        label="Book Name"
                        type="text"
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
                    />
                    <TextField
                        autoFocus
                        required
                        margin="dense"
                        id="authorName"
                        name="authorName"
                        label="Author Name"
                        type="text"
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
                    />
                    <TextField
                        autoFocus
                        required
                        type="number"
                        margin="dense"
                        id="price"
                        name="price"
                        label="Price"
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
                    />
                </DialogContent>
                <DialogActions className="d-flex d-flex justify-content-between">
                    <Button onClick={() => { setFlags({ isAddable: false }) }} variant="contained" >Cancel</Button>
                    <Button type="submit" variant="contained" color="success">Insert</Button>
                </DialogActions>
            </Dialog>

            <Dialog
                open={Flags.isDeletable}
                onClose={() => setFlags({ isDeletable: false })}
            >
                <DialogContent>
                    <Alert severity="error">
                        Are you confirm to delete ?
                    </Alert>
                </DialogContent>
                <DialogActions className="d-flex d-flex justify-content-between">
                    <Button onClick={() => { setFlags({ isDeletable: false }) }} variant="contained" >Cancel</Button>
                    <Button onClick={(e) => { doDelete(e) }} variant="contained" color="success">Confirm</Button>
                </DialogActions>
            </Dialog>

            <Dialog
                open={Flags.isEditable}
                onClose={() => setFlags({ isEditable: false })}
                PaperProps={{
                    component: 'form',
                    onSubmit: (e) => handleUpdate(e),
                }}
            >
                <DialogTitle className="text-center h2">Enter details to Update</DialogTitle>
                <DialogContent>
                    <TextField
                        autoFocus
                        required
                        margin="dense"
                        id="bookId"
                        name="bookId"
                        label="Book Name"
                        type="text"
                        fullWidth
                        variant="standard"
                        defaultValue={editData.bookId}
                        disabled={true}
                    />
                    <TextField
                        autoFocus
                        required
                        margin="dense"
                        id="bookName"
                        name="bookName"
                        label="Book Name"
                        type="text"
                        fullWidth
                        variant="standard"
                        defaultValue={editData.bookName}
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
                    />
                    <TextField
                        autoFocus
                        required
                        margin="dense"
                        id="authorName"
                        name="authorName"
                        label="Author Name"
                        type="text"
                        fullWidth
                        variant="standard"
                        defaultValue={editData.authorName}
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
                    />
                    <TextField
                        autoFocus
                        required
                        margin="dense"
                        id="price"
                        name="price"
                        label="Price"
                        type="number"
                        fullWidth
                        variant="standard"
                        defaultValue={editData.price}
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
                    />
                </DialogContent>
                <DialogActions className="d-flex d-flex justify-content-between">
                    <Button onClick={() => { setFlags({ isEditable: false }) }} variant="contained" >Cancel</Button>
                    <Button type="submit" variant="contained" color="success">Update</Button>
                </DialogActions>
            </Dialog>

            <Snackbar open={Flags.isVisible} autoHideDuration={6000} anchorOrigin={{ vertical: "bottom", horizontal: "left" }}  onClose={() => { setFlags({ isVisible: false }); window.location.reload(); }}>
                <Alert
                    onClose={() => { setFlags({ isVisible: false }); window.location.reload(); }}
                    severity="success"
                    variant="filled"
                    sx={{ width: '100%' }}
                >
                    {Flags.msg}
                </Alert>
            </Snackbar>
            <Snackbar open={Flags.isWrongVisible} autoHideDuration={6000} anchorOrigin={{ vertical: "top", horizontal: "right" }} style={{ marginTop: "115px" }} onClose={() => { setFlags({ isWrongVisible: false }); window.location.reload(); }}>
                <Alert
                    onClose={() => { setFlags({ isWrongVisible: false }); window.location.reload(); }}
                    severity="error"
                    variant="filled"
                    sx={{ width: '100%' }}
                >
                    {Flags.msg}
                </Alert>
            </Snackbar>
        </div>

    );
}

export default Home;
