#!/usr/bin/env groovy
import groovy.json.JsonSlurper

def helloworld() {
    def ids = sh(script: 'aws ec2 describe-volumes --region us-east-1 --query \'Volumes[*].VolumeId\'', returnStdout: true)
//    echo "Here's are list: ${list}"
    def list = new JsonSlurper().parseText(ids)

    for(item in list) {
        println(item)
    }
}

return this