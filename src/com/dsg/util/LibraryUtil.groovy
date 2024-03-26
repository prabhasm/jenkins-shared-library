package com.dsg.util

class LibraryUtil {
    def static capitalizeFirstLetter(def input) {
        // Check if the input string is not null or empty
        if (input && input.length() > 0) {
            // Convert the first character to uppercase and concatenate with the rest of the string converted to lowercase
            return input[0].toUpperCase() + input[1..-1].toLowerCase()
        } else {
            return input // Return input as is if it's null or empty
        }
    }
}
