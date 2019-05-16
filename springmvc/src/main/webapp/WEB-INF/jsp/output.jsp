<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
    <head><title>Spring MVC Form Output</title></head>
    <body>
        <h2>Submitted User information</h2>
        <form:form method="POST" action="/springmvc/inputUser">
            <table>
                <tr>
                    <td>Last Name</td>
                    <td>${lname}</td>
                </tr>
                <tr>
                    <td>First Name</td>
                    <td>${fname}</td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>${gender}</td>
                </tr>
            </table>
        </form:form>
    </body>
</html>