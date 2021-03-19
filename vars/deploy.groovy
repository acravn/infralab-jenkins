#!/usr/bin/env groovy

def call() {
    pipeline {
        agent any
        stages {
            stage('Checkout SCM') {
                checkout scm
            }

            stage('Run Stuff') {
                helloworld.test2()
            }
        }
    }
}