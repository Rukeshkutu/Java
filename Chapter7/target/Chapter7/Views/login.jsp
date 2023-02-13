<%@ include file="layouts/header.jsp"%>

<h1>This is login</h1>

<form method="POST" action="/login">
  <div>
    <label>Email: </label>
    <input type="email" name="email">
  </div>

  <div>
    <label>Password: </label>
    <input type="password" name="password">
  </div>
  <button type="submit">submit</button>
</form>




<%@ include file="layouts/footer.jsp"%>

