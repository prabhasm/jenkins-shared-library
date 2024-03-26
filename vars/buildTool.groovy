#!/usr/bin/env groovy

import com.dsg.exception.ParameterException
/**
 * =================================================
 * 1.0.0
 * =================================================
 * used to call from Jenkinsfile and based on the toolType it will route respective class
 * structure of map:
 * build: [
 *  tool_type: 'maven',
 *  install: 'true',
 *  tool_url: '',
 *  tool_home: '',
 *  tool_settings: '',
 *  app_dir: '',
 *  command: ''
 * ]
 *
 * @param hookConfig
 */
def call(Map hookConfig = [:]){

    //TODO-provide function to read hookConfig from different repos, 1.1.0
    //TODO- validate hookConfig, 1.1.0
    def toolType = hookConfig.build.tool_type

    if(!toolType || toolType == ""){
        throw new ParameterException("tool_type is required")
    }

    def builderClass = toolType.toLowerCase()+'Builder'
    def result = ${builderClass}(hookConfig)


}
