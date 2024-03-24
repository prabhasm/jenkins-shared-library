package com.dsg.exception

// Define a custom exception class
class ParameterException extends Exception {

    // Constructor that accepts a message
    ToolTypeException(String message) {
        super(message)
    }

}

def call(Map hookConfig = [:]){

    def toolType = hookConfig.toolType

    if(!toolType){
        // Throw the custom exception
        throw new ToolTypeException("Tool type is required")
    }

    if(toolType == ""){
        // Throw the custom exception
        throw new ToolTypeException("Tool type cannot be blank")
    }

    // rest of method

}

try {

    // code that may throw exception

} catch (ToolTypeException e) {

    // handle custom exception
    println "A ToolTypeException was caught: ${e.message}"

}


