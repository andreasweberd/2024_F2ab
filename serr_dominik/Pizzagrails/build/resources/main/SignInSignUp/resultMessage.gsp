<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>...</title>
</head>

<body>
<content tag="nav">

</content>

<div class="svg" role="presentation">
    <div class="grails-logo-container">
        <asset:image src="grails-cupsonly-logo-white.svg" class="grails-logo"/>
    </div>
</div>

<div id="content" role="main">
    <div class="container">
        <p>${registrationSuccess}</p>
        <br>
        <hr>
        <br>
        <g:link action="login">
            <button type="button">Login</button>
        </g:link>
    </div>
</div>

</body>
</html>
