import React, { Component } from 'react';

class FormHandlingExample extends Component {
    constructor() {
        super()
        
        this.state = {
            firstName: "",
            flag : false
        }
    }

    formHandler = (e) =>{
        this.setState({firstName: e.target.value});
    }

    validate = () =>{
        if(this.state.firstName === ""){
            alert('Name Should not be Empty');
        }
        else{
            this.setState({flag : true});
        }
    }

    submitHandler = (e) =>{
        e.preventDefault();
        if(this.state.flag){
            alert('Form Submitted Successfully');
        }
    }
    
    render() {
        return (
        <div>
            <form onSubmit={this.submitHandler}>
                <table>
                    <tr>
                        <td><label htmlFor="fname">First Name:</label></td>
                        <td><input type='text' onChange={this.formHandler} name='fname' /></td>
                    </tr>
                    <tr>
                        <td colSpan='2'><input type='submit' onClick={this.validate}/></td>
                    </tr>
                </table>
            </form>
        </div>
        );
    }
}

export default FormHandlingExample;
