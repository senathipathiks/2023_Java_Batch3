import React, { Component } from 'react'
import EmployeeService from '../Services/EmployeeService'

class ViewEmployeeComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            empId: this.props.match.params.empId,
            employee: {}
        }
    }

    componentDidMount(){
        EmployeeService.getEmployeeById(this.state.empId).then( res => {
            this.setState({employee: res.data});
        })
    }

    render() {
        return (
            <div>
                <br></br>
                <div className = "card col-md-6 offset-md-3">
                    <h3 className = "text-center"> View Employee Details</h3>
                    <div className = "card-body">
                        <div className = "row">
                            <label> Employee Id: </label>
                            <div> { this.state.employee.empId }</div>
                        </div>
                        <div className = "row">
                            <label> Employee Name: </label>
                            <div> { this.state.employee.empName }</div>
                        </div>
                        <div className = "row">
                            <label> Employee Salary: </label>
                            <div> { this.state.employee.salary }</div>
                        </div>
                    </div>

                </div>
            </div>
        )
    }
}

export default ViewEmployeeComponent