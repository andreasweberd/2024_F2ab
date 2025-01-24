<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to PizzaGrails</title>
</head>

<body>
<content tag="nav">
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
           aria-expanded="false">Login <span class="caret"></span></a>
        <ul class="dropdown-menu">
            <li class="dropdown-item"><a
                    href="${createLink(controller: "signInSignUp", action: 'login')}">Login</a></li>
            <li class="dropdown-item"><a href="${createLink(controller: "signInSignUp", action: 'signup')}">Sign up</a></li>
        </ul>
    </li>
</content>

<div class="svg" role="presentation">
    <div class="grails-logo-container">
        <asset:image src="pizzagrails.png" class="grails-logo"/>
    </div>
</div>

<div id="content" role="main">
    <div class="container">
        <section class="row colset-2-its">
            <h1>Welcome to PizzaGrails</h1>

            <p>
                Congratulations on finding this amazing application!
                If you´re new please sign up and get started with your own pizza.
            </p>
        </section>
    </div>
</div>

</body>
</html>
