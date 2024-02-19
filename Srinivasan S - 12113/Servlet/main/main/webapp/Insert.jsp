<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Insert</title>
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
      crossorigin="anonymous"
    />

    <style>
      body {
        background: url("https://img.freepik.com/free-photo/abstract-surface-textures-white-concrete-stone-wall_74190-8189.jpg?size=626&ext=jpg&ga=GA1.1.87170709.1707523200&semt=sph")
          no-repeat center fixed;
        background-size: 65%;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        height: 80%;
        width: 100%;
      }
      div {
        margin-top: 10%;
        border: 2px solid black;
        backdrop-filter: blur(25px);
      }
      #t1 {
        margin: 30px;
        //padding-top: 10px;
        padding: 10px;
        
        //color: white
        
      }
      #div1 {
        border-radius: 10px;
      }
    </style>
  </head>
  <body>
    <br />
    <br />
    <br />
    <br />
    <div id="div1">
      <h5 class="card-title">Student Details</h5>

      <form action="InsertServlet" style="margin: 10px" method="post">
        <table
          id="t1"
          border="1"
          align="center"
          class="shadow-lg p-3 mb-5 bg-body rounded"
        >
          <tr>
            <td>Student Id:</td>
            <td><input type="text" name="sid" /></td>
          </tr>

          <tr>
            <td>Student name:</td>
            <td><input type="text" name="sname" /></td>
          </tr>

          <tr>
            <td>City:</td>
            <td><input type="text" name="scity"></td>
          </tr>

          <tr>
            <td colspan="2">
              <input
                id="but"
                type="submit"
                class="btn btn-primary btn-sm"
                value="Insert"
                name="button"
              />
            </td>
          </tr>
        </table>
      </form>
    </div>
  </body>
</html>
