pipeline {
    agent any
    stages {
        stage("Source Checkout"){
            steps {
                git branch:  'topic/cliu2/initialize', url: 'https://github.com/chenliu1993/pipelines-auto.git'
                sh(script: "go build main.go -o main", returnStatus: true)
            }
            
        }
    }

}