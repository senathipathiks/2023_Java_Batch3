import React from 'react'

function Work() {
  return (
    <div className="mbsc-grid mbsc-grid-fixed">
                <div className="mbsc-form-group">
                    <div className="mbsc-row mbsc-justify-content-center">
                        <div className="mbsc-col-md-10 mbsc-col-xl-8 mbsc-form-grid">
                            <div className="mbsc-form-group-title">Multiple columns grid</div>
                            <div className="mbsc-row">
                                <div className="mbsc-col-md-6 mbsc-col-12">
                                    <input type="text" label="Email" placeholder="Email" inputStyle="box" labelStyle="floating" />
                                </div>
                                <div className="mbsc-col-md-6 mbsc-col-12">
                                    <input type="password" label="Password" placeholder="Password" passwordToggle="true" inputStyle="box" labelStyle="floating" />
                                </div>
                            </div>
                            <div className="mbsc-row">
                                <div className="mbsc-col-12">
                                    <input type="text" label="Address" placeholder="Address" inputStyle="box" labelStyle="floating" />
                                </div>
                            </div>
                            <div className="mbsc-row">
                                <div className="mbsc-col-md-6 mbsc-col-12">
                                    <input type="text" label="City" placeholder="City" inputStyle="box" labelStyle="floating" />
                                </div>
                                <div className="mbsc-col-md-4 mbsc-col-6">
                                </div>
                                <div className="mbsc-col-md-2 mbsc-col-6">
                                    <input type="text" label="Zip" placeholder="Zip" inputStyle="box" labelStyle="floating" />
                                </div>
                            </div>
                            <label htmlFor='hibbies'>Hobbies</label>
                            <select id='hobbies'>select</select>
                            <button>Sign in</button>
                        </div>
                    </div>
                </div>
                
            </div>
  )
}

export default Work
