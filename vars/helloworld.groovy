#!/usr/bin/env groovy

def helloworld() {
    def list = sh 'aws ec2 describe-volumes --region us-east-1 --query \'Volumes[*].VolumeId\''

    echo "${list}"
}

return this