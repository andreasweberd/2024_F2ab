
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Create Kreditkarte</title>
</head>
<body>
    <h1>Create Kreditkarte</h1>
    <g:form action="save">
        <fieldset class="form">
            <g:field type="text" name="kreditkartennummer" value="${kreditkarte?.kreditkartennummer}" required=""/>
        </fieldset>
        <fieldset class="buttons">
            <g:submitButton name="create" class="save" value="Create"/>
        </fieldset>
    </g:form>
</body>
</html>