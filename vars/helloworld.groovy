#!/usr/bin/env groovy

def helloworld() {
    echo "hello world from groovy"
    sh 'aws ec2 describe-volumes --region us-east-1 --query \'Volumes[*].VolumeId\''
}

return this