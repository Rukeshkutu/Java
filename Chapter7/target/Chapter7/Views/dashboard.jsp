<%@ include file="layouts/header.jsp"%>

<h1>welcome <%out.println(session.getAttribute("loggedInUserName"));%><br>
Your id is <%out.println(session.getAttribute("loggedInUserId"));%>
</h1>


<%
    Cookie cookie[] = request.getCookies();
    for(Cookie cook: cookie){
        if(cook.getName().equals("email")){
            out.print("i found a cookied with name emael and the value is" + cook.getValue());
        }
    }
%>


<form method="POST" action="/dashboard">
    <button type="submit">logout</button>
</form>
<%--<%--%>
<%--    for (int i =0; i < 5; i++){%>--%>
<%--    <h1>tribhuwan unibersity</h1>--%>
<%--<%}%>--%>
<%-- declearing a  variable --%>
<%@ include file="layouts/footer.jsp"%>
<%--<%! int i = 0; %>--%>
<%--<%--%>
<%--    for (i =0; i < 5; i++){%>--%>
<%--<h1>tribhuwan unibersity</h1>--%>
<%--<%}%>--%>

