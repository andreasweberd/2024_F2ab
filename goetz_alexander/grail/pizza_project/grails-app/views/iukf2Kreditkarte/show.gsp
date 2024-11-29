
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Show Kreditkarte</title>
</head>
<body>
    <h1>Show Kreditkarte</h1>
    <div>
        <label>Kreditkartennummer:</label>
        <span>${kreditkarte?.kreditkartennummer}</span>
    </div>
    <g:link action="edit" id="${kreditkarte?.id}">Edit</g:link>
    <g:form action="delete" method="POST">
        <g:hiddenField name="id" value="${kreditkarte?.id}"/>
        <g:submitButton name="delete" class="delete" value="Delete"/>
    </g:form>
</body>
</html>