import React from 'react'

function Login() {
  return (
    <div>
      <div className="container-fluid bg-dark bg-opacity-25">
        <section className="center container  d-flex flex-column  align-items-center justify-content-center ">
          <h1>Login</h1>
          <form action="" className="form">
            <table className="tab">
              <tr className="row">
                <td>
                  <label htmlFor="usr">UserName : </label>
                  <input id="usr" type="text" placeholder=" username" />
                </td>
              </tr>
              <tr class="row">
                <td>
                  <label htmlFor="pass">Password : </label>
                  <input id="pass" type="password" placeholder="password" />
                </td>
              </tr>
              <tr className="row">
                <td colspan="2" align="center">
                  <input class="button" type="submit" value="login" />
                </td>
              </tr>
              <tr className="row">
                <td colspan="2" align="center">
                  <span class="res"></span>
                </td>
              </tr>
              <tr className="row">
                <td colspan="2" align="center">
                  <span className="reg-link">
                    <a href="#">forget password? </a>or
                  </span>
                </td>
              </tr>
              <tr class="row">
                <td colspan="2" align="center">
                  <span class="reg-link">
                    Don't have account ?
                    <a href="./Registration.html">register here..!</a>
                  </span>
                </td>
              </tr>
            </table>
          </form>
        </section>
      </div>
    </div>
  );
}

export default Login
