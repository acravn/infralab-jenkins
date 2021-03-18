def code

node('worker') {
    stage('Checkout') {
        checkout scm
    }

    stage('Load') {
        code = load 'vars/helloworld.groovy'
    }

    stage('Run') {
        code.testStringSplit("test.com/charter/nvis-cmm-retriever")
    }
}