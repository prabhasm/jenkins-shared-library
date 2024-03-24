#!/usr/bin/env groovy

/**
 * =================================================
 * 1.0.0
 * =================================================
 * used to call from Jenkinsfile and based on the toolType it will route respective class
 *
 *
 * @param hookConfig
 */
def call(Map hookConfig = [:]){

    //TODO-provide function to read hookConfig from different repos, 1.1.0
    //TODO- validate hookConfig, 1.1.0
    def toolType = hookConfig.build.toolType

    if(!toolType){
        throw new Exception("toolType is required")
    }

    if(toolType == ""){
        throw new Exception("toolType cannot be blank")
    }


}
