def code

node('worker') {
    stage('Checkout') {
        checkout scm
    }

    stage('Load') {
        code = load 'vars/helloworld.groovy'
    }

    stage('Run') {
        code.helloworld("us-east-1")
    }
}