#!/usr/bin/env groovy

def call() {
    pipeline {
        agent any
        stages {
            stage('Checkout SCM') {
                script {
                    checkout scm
                }
            }

            stage('Run Stuff') {
                script {
                    helloworld.test2()
                }
            }
        }
    }
}