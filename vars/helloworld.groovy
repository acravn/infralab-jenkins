#!/usr/bin/env groovy
import groovy.json.JsonSlurper

def helloworld(region) {

    def ids = sh(script: "aws ec2 describe-volumes --region '$region' --query 'Volumes[*].VolumeId'", returnStdout: true)
    def list = new JsonSlurper().parseText(ids)

    for(item in list) {
        println(item)
    }
}

return this