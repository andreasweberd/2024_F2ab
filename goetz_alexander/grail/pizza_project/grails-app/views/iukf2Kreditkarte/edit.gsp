
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Edit Kreditkarte</title>
</head>
<body>
    <h1>Edit Kreditkarte</h1>
    <g:form action="update">
        <g:hiddenField name="id" value="${kreditkarte?.id}"/>
        <fieldset class="form">
            <g:field type="text" name="kreditkartennummer" value="${kreditkarte?.kreditkartennummer}" required=""/>
        </fieldset>
        <fieldset class="buttons">
            <g:submitButton name="update" class="save" value="Update"/>
        </fieldset>
    </g:form>
</body>
</html>