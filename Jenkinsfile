def code
pipeline {
    agent any
    stages {
        stage('Checkout SCM') {
            steps {
                script {
                    checkout scm
                }
            }
        }

        stage('Load groovy') {
            steps {
                script {
                    code = load 'vars/helloworld.groovy'
                    code.test2()
                }
            }

        }
    }
}