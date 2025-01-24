
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Kreditkarte List</title>
</head>
<body>
    <h1>Kreditkarte List</h1>
    <g:link action="create">Create New Kreditkarte</g:link>
    <table>
        <thead>
            <tr>
                <th>Kreditkartennummer</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <g:each in="${kreditkarteList}" var="kreditkarte">
                <tr>
                    <td>${kreditkarte.kreditkartennummer}</td>
                    <td>
                        <g:link action="show" id="${kreditkarte.id}">Show</g:link>
                        <g:link action="edit" id="${kreditkarte.id}">Edit</g:link>
                        <g:form action="delete" method="POST">
                            <g:hiddenField name="id" value="${kreditkarte.id}"/>
                            <g:submitButton name="delete" class="delete" value="Delete"/>
                        </g:form>
                    </td>
                </tr>
            </g:each>
        </tbody>
    </table>
</body>
</html>