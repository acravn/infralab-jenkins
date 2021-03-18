#!/usr/bin/env groovy
import groovy.json.JsonSlurper

def helloworld(region) {

    def ids = sh(script: "aws ec2 describe-volumes --region '$region' --query 'Volumes[*].VolumeId'", returnStdout: true)
//    def list = new JsonSlurper().parseText(ids)
    return new JsonSlurper().parseText(ids)
}

def testStringSplit(String test) {

    def splitSt = test.split('/')

    println(splitSt[0] + " " + splitSt[-1])
}

def test2() {
    def list = helloworld("us-east-1")

    for(item in list)
        println("Item: " + item)
}

return this