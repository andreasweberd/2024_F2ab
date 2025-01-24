<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <style>
    body {
        font-family: Arial, sans-serif;
        display: flex;
        align-items: center;
        justify-content: center;
        height: 100vh;
        margin: 0;
        background-color: #f9f9f9;
    }

    .form-container {
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0px 4px 12px rgba(0, 0, 0, 0.1);
        width: 280px;
        box-sizing: border-box;
    }

    .form-container label {
        display: block;
        font-weight: bold;
        margin-bottom: 5px;
    }

    .form-container input,
    .form-container select {
        width: 100%;
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 4px;
        font-size: 14px;
        box-sizing: border-box;
    }

    .form-container button {
        width: 100%;
        padding: 10px;
        font-size: 16px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    .form-container .submit-button {
        background-color: #333;
        color: #fff;
        margin-bottom: 10px;
        /* Add space between buttons */
    }

    .form-container .submit-button:hover {
        background-color: #555;
    }

    .form-container .skip-button {
        background-color: #e0e0e0;
        color: #333;
    }

    .form-container .skip-button:hover {
        background-color: #ccc;
    }
    </style>
</head>

<body>
<div class="form-container">
    <form action="${createLink(controller: "signInSignUp", action: 'register')}" method="post">
        <label for="username">Name*</label>
        <input type="text" id="username" name="username" required>

        <label for="password">Password*</label>
        <input type="text" id="password" name="password" required>

        <label for="email">Email*</label>
        <input type="email" id="email" name="email" required>

        <label for="location">Location</label>
        <select id="location" name="location">
            <g:each in="${locationList}" var="location">
                <option value="${location.id}">${location.name}</option>
            </g:each>
        </select>

        <button type="submit" class="submit-button">Submit</button>
        <g:link action="redirect">
            <button type="button" class="skip-button">Close form</button>
        </g:link>
    </form>
</div>
</body>

</html>