import React, { Component } from 'react'
import EmployeeService from '../Services/EmployeeService';

class CreateEmployeeComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            // step 2
            empId: this.props.match.params.empId,
            empName: '',
            salary: ''
            
        }
        this.changeEmpIdHandler = this.changeEmpIdHandler.bind(this);
        this.changeEmpNameHandler = this.changeEmpNameHandler.bind(this);
        this.changeSalaryHandler = this.changeSalaryHandler.bind(this);
        this.saveOrUpdateEmployee = this.saveOrUpdateEmployee.bind(this);
    }

    // step 3
    componentDidMount(){

        // step 4
        if(this.state.id === '_add'){
            return
        }else{
            EmployeeService.getEmployeeById(this.state.id).then( (res) =>{
                let employee = res.data;
                this.setState({empId: employee.empId,
                    empName: employee.empName,
                    salary : employee.salary
                });
            });
        }        
    }
    saveOrUpdateEmployee = (e) => {
        e.preventDefault();
        let employee = {empId: this.state.empId, empName: this.state.empName, salary: this.state.salary};
        console.log('employee => ' + JSON.stringify(employee));

        // step 5
        if(this.state.id === '_add'){
            EmployeeService.createEmployee(employee).then(res =>{
                this.props.history.push('/employees');
            });
        }else{
            EmployeeService.updateEmployee(employee, this.state.id).then( res => {
                this.props.history.push('/employees');
            });
        }
    }
    
    changeEmpIdHandler= (event) => {
        this.setState({empId: event.target.value});
    }

    changeEmpNameHandler= (event) => {
        this.setState({empName: event.target.value});
    }

    changeSalaryHandler= (event) => {
        this.setState({salary: event.target.value});
    }

    cancel(){
        this.props.history.push('/employees');
    }

    getTitle(){
        if(this.state.id === '_add'){
            return <h3 className="text-center">Add Employee</h3>
        }else{
            return <h3 className="text-center">Update Employee</h3>
        }
    }
    render() {
        return (
            <div>
                <br></br>
                   <div className = "container">
                        <div className = "row">
                            <div className = "card col-md-6 offset-md-3 offset-md-3">
                                {
                                    this.getTitle()
                                }
                                <div className = "card-body">
                                    <form>
                                        <div className = "form-group">
                                            <label> Employee Id: </label>
                                            <input placeholder=" Id" name="empId" className="form-control" 
                                                value={this.state.empId} onChange={this.changeEmpIdHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> Employee Name: </label>
                                            <input placeholder=" Name" name="empName" className="form-control" 
                                                value={this.state.empName} onChange={this.changeEmpNameHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> Employee Salary: </label>
                                            <input placeholder="Salary" name="salary" className="form-control" 
                                                value={this.state.salary} onChange={this.changeSalaryHandler}/>
                                        </div>

                                        <button className="btn btn-success" onClick={this.saveOrUpdateEmployee}>Save</button>
                                        <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft: "10px"}}>Cancel</button>
                                    </form>
                                </div>
                            </div>
                        </div>

                   </div>
            </div>
        )
    }
}

export default CreateEmployeeComponent