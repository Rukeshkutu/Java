<%@ include file="layouts/header.jsp"%>

<h1>This is Register</h1>

<form method="POST" action="/register">
  <div>
    <label>Name: </label>
    <input type="text" name="name">
  </div>

  <div>
    <label>Email: </label>
    <input type="email" name="email">
  </div>

  <div>
    <label>Password: </label>
    <input type="password" name="password">
  </div>

  <div>
    <button type="submit">Register</button>
  </div>

</form>




<%@ include file="layouts/footer.jsp"%>

