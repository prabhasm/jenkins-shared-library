#!/usr/bin/env groovy

def call(Map config = [:], Closure body) {
    def debug = env.DEBUG
    if (debug != null) {config.debug = debug}



}

return this
