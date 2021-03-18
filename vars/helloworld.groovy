#!/usr/bin/env groovy

def helloworld() {
    def list = sh(script: 'aws ec2 describe-volumes --region us-east-1 --query \'Volumes[*].VolumeId\'', returnStdout: true)
    echo "Here's are list: ${list}"
}

return this