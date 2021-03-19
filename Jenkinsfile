def code
pipeline {
    agent any
    stages {
        stage('Checkout SCM') {
            checkout scm
        }

        stage('Load groovy') {
            code = load 'vars/helloworld'
            code.test2()
        }
    }
}