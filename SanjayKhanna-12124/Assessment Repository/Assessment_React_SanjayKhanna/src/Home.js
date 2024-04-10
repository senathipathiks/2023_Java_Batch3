import React from 'react'

function Home() {
  return (
    <div>
      <h1>Welcome to the Laptop Allocation Management System!</h1>
      <div className='container'>
        <div className='c1'>
      <p>Welcome to the Laptop Allocation Management System (LAMS), a web-based application that allows you to request, assign, and track laptops and other IT assets for your employees.</p> 
      <p>LAMS is designed to simplify and streamline the process of IT asset management, from planning and ordering to operation and maintenance. With LAMS, you can:</p>
      <span className='sp'>- View the inventory of available laptops and other IT assets in real time</span>
      <span className='sp'>- Approve or reject requests from your subordinates or peers</span>
      <span className='sp'>- Assign a laptop or other IT asset to an employee or a host machine </span>
      <span className='sp'>- Track the location, status, and usage of each laptop or other IT asset</span>
      <span className='sp'>- Receive notifications and reminders for expiring licenses, end-of-life dates, and warranty details</span>
      <span className='sp'>- Retire or dispose of laptops or other IT assets that are no longer needed</span>
      <span className='sp'>- Generate reports and analytics for IT asset allocation and utilization</span><br/>
      <p>LAMS is integrated with the ServiceNow Asset Management product, which provides a consistent global process and a capability to track assets from end to end.</p>
      <p>LAMS also follows the best practices for assigning IT assets to employees, based on their level of seniority, role, and needs</p>
      <p>To get started, please log in with your credentials and select the appropriate option from the menu. If you have any questions or feedback, please contact the IT support team or visit the FAQ section. Thank you for using LAMS!</p>
    </div>
    </div>
    </div>
  )
}

export default Home