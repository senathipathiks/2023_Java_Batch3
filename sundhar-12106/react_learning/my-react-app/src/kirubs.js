function Kirub() {
    return (
      <div class="container">
        <section class="center">
          <h1>Login</h1>
          <form action="" class="form">
            <table class="tab">
              <tr class="row">
                <td>
                  <label for="usr">UserName : </label>
                </td>
                <td>
                  <input id="usr" type="text" placeholder=" username" />
                </td>
              </tr>
              <tr class="row">
                <td>
                  <label for="pass">Password : </label>
                </td>
                <td>
                  <input id="pass" type="password" placeholder="password" />
                </td>
              </tr>
              <tr class="row">
                <td colspan="2" align="center">
                  <input class="button" type="submit" value="login" />
                </td>
              </tr>
              <tr class="row">
                <td colspan="2" align="center">
                  <span class="res"></span>
                </td>
              </tr>
              <tr class="row">
                <td colspan="2" align="center">
                  <span class="reg-link">
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
    );
}

export default Kirub;