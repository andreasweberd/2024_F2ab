package org.iukf2


class SignInSignUpController {

    def redirect() {
        redirect(uri: "/")
    }

    def index() {
        render view: "index"
    }

    def login() {
        render view: "login"
    }

    def signup() {
        def locations = Location.list()
        render view: "signup", model: [locationList: locations]
    }

    def checkLogin() {
        def usernamePassword = params
        def customerList = Customer.list()
        def customer = customerList.find(c -> c.username.equals(usernamePassword.username))
        if(customer != null) {
            if(customer.password.equals(usernamePassword.password)) {
                resultMessage("Login",true)
            } else {
                resultMessage("Login",false)
            }
        }
    }

    def register() {
        def customer = new Customer(params)
        if (customer.save()) {
            resultMessage("Registration", true)
        } else {
            resultMessage("Registration",false)
        }
    }

    def resultMessage(String process, boolean success) {
        if (success) {
            String message = "${process} was successful. Happy ordering!"
            render view: "resultMessage", model: [registrationSuccess: message]
        } else {
            String message = "${process} failed. Please try again"
            render view: "resultMessage", model: [registrationSuccess: message]
        }
    }
}