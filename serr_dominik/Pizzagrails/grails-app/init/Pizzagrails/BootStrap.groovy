package Pizzagrails

import org.iukf2.Location

class BootStrap {

    def init = { servletContext ->
        if (Location.count() == 0) {
            new Location(name: "------", address: "---", town: "---", postalCode: "---").save(failOnError: true)
            new Location(name: "Palastgarten", address: "Seizstraße 6", town: "Trier", postalCode: "54290").save(failOnError: true)
            new Location(name: "Hauptmarkt", address: "Hauptmarkt 16", town: "Trier", postalCode: "54290").save(failOnError: true)
            new Location(name: "Hauptbahnhof", address: "Bahnhofsplatz 1", town: "Trier", postalCode: "54292").save(failOnError: true)
        }
    }
    def destroy = {
    }
}