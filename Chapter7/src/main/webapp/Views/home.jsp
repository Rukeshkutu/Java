<%@include file="layouts/header.jsp"%>

<h5>
    <%
        if(session.getAttribute("message") != null){
            out.print(session.getAttribute("message"));
        }

    %>
</h5>

<a href="/login">
    <button>Login</button>
</a>
<a href="/register">
    <button>Register</button>
</a>

<%
    if(session.getAttribute("message") != null){
        session.removeAttribute("message");
    }

%>

<%@ include file="layouts/footer.jsp"%>