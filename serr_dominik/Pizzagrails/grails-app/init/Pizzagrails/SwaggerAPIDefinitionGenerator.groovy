package Pizzagrails


import grails.util.Holders

class SwaggerGenerator {

    static void main(String[] args) {
        generateSwaggerYAML()
    }

    static void generateSwaggerYAML() {
        def file = new File("swagger.yaml")
        file.text = "" // Clear the file or overwrite

        def domainClasses = Holders.grailsApplication.domainClasses
        def yaml = new StringBuilder()
        yaml.append("openapi: 3.0.0\n")
        yaml.append("components:\n")
        yaml.append("  schemas:\n")

        domainClasses.each { domainClass ->
            yaml.append(generateSchemaForDomainClass(domainClass))
        }

        file.write(yaml.toString())
    }

    static String generateSchemaForDomainClass(domainClass) {
        def schema = new StringBuilder()
        schema.append("    ${domainClass.name}:\n")
        schema.append("      type: object\n")
        schema.append("      properties:\n")

        domainClass.persistentProperties.each { property ->
            schema.append("        ${property.name}:\n")
            schema.append("          type: ${convertPropertyType(property.type)}\n")
        }

        schema.append("      required:\n")

        domainClass.constrainedProperties.each { name, constraint ->
            if (!constraint.nullable) {
                schema.append("        - ${name}\n")
            }
        }
        return schema.toString()
    }

    static String convertPropertyType(type) {
        if (type == String) return "string"
        if (type == Integer || type == Long) return "integer"
        if (type == Double || type == Float) return "number"
        if (type == Boolean) return "boolean"
        if (type == Date) return "string (date-time)"
        return "object"
    }
}