<html>
<body>



<h1>  ERS Application project1 </h1>

<a href="login.html"> Login </a>

<a href="registration.html"> Signup</a>

<form action="http://localhost:8086/ERS/DisplayEmployees"  method="get">

<input type="submit" value="Display Employees">

</form>

<br>

<form action="http://localhost:8086/ERS/UpdateEmployee"  method="get">
 <table class="table table-hover">
    <thead>
      <tr>
        <td>ID</td>
        <td><Input  type="text" name="id" required></td>
       
      </tr>
      <tr>
        <td>Password</td>
        <td><Input  type="password" name="pwd" required></td>
       
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>Name</td>
        <td><input  type="text" name="name" required></td>
      
      </tr>
      <tr>
        <td>Department</td>
        <td><input  type="text" name="dep" required></td>
      
      </tr>
       <tr>
        <td>Designation</td>
        <td><input  type="text" name="des" required></td>
      
      </tr>
       <tr>
        <td>Email</td>
        <td><input  type="email" name="email" required></td>
      
      </tr>
      <tr>
        <td>Type</td>
        <td>E<input  type="radio" name="type" value="employee" ></td>
        <td>M<input  type="radio" name="type" value="manager" ></td>
      
      </tr>
      <tr>
       
      </tr>
    </tbody>
  </table>

<input type="submit" value="updateEmployee">

</form>

<form action="http://localhost:8086/ERS/ListAllEmployeeForUpdate"  method="get">
<input type="submit" value="listIDs">


 <h2> for ID selection</h2>
 ListAllEmployeeForUpdate
</form>
</body>
</html>
