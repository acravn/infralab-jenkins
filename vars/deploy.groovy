#!/usr/bin/env groovy

def call() {
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

            stage('Run Stuff') {
                steps {
                    script {
                        helloworld.test2()
                    }
                }
            }
        }
    }
}