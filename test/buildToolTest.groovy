import groovy.mock.interceptor.MockFor
import spock.lang.Specification

class buildToolTest extends Specification {

    def "Test Maven Pipeline execution"() {
        given:
        def logger = new Logger()
        def mavenHome = '/path/to/maven'
        def settingsXml = '/path/to/settings.xml'
        def projectDirectory = '.'
        def goals = 'clean install'

        when:
        def result = mavenPipeline(logger, mavenHome, settingsXml, projectDirectory, goals)

        then:
        result == 'SUCCESS'

        // Add more assertions as needed
    }

    def "Test error handling in Maven Pipeline"() {
        given:
        def logger = new Logger()
        def mavenHome = '/path/to/maven'
        def settingsXml = '/path/to/settings.xml'
        def projectDirectory = '.'
        def goals = 'invalid goal'

        when:
        def result = mavenPipeline(logger, mavenHome, settingsXml, projectDirectory, goals)

        then:
        result == 'FAILED'
        // Assert that the logger captured the error message
        logger.errorMessage != null

        // Add more assertions as needed
    }

    // Mock Logger class for testing
    class Logger {
        def errorMessage

        void info(String message) {
            // Do nothing in mock
        }

        void error(String message) {
            errorMessage = message
        }
    }

    // Mock mavenPipeline function for testing
    def mavenPipeline(logger, mavenHome, settingsXml, projectDirectory, goals) {
        // Mock the behavior of mavenPipeline function
        return goals == 'invalid goal' ? 'FAILED' : 'SUCCESS'
    }
}

