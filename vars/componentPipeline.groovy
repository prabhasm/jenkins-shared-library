

def call(Map config, Closure body) {
    def debug = env.DEBUG
    if (debug != null) {
        config.debug = debug
    }

    //def logger = new Logger(this, config.debug)
    //def pipeline = new Pipeline(this, logger)
    String processId = "${env.JOB_NAME}/${env.BUILD_NUMBER}"
    try {
        //pipeline.execute(config, body)
    } finally {

    }
}

return this
