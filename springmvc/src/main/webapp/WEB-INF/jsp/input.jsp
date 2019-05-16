<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
    <head><title>Spring MVC Form Input</title></head>
    <body>
        <h2>User information</h2>
        <form:form method="POST" action="/springmvc/inputUser">
            <table>
                <tr>
                    <td><form:label path="lname">Last Name</form:label></td>
                    <td><form:input path="lname"></form:input></td>
                </tr>
                <tr>
                    <td><form:label path="fname">First Name</form:label></td>
                    <td><form:input path="fname"></form:input></td>
                </tr>
                <tr>
                    <td><form:label path="gender">Gender</form:label></td>
                    <td><form:input path="gender"></form:input></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Submit"/>
                    </td>
                </tr>
            </table>
        </form:form>
    </body>
</html>