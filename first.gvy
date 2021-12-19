pipeline {
    agent any
    stages {
        stage("Source Checkout"){
            steps {
                dir(path: "./helloworld") {
                    git (
                        branch:  'topic/cliu2/initialize', 
                        url: 'git@github.com:chenliu1993/pipelines-auto.git',
                        credentialsId: 'prikey',
                        changelog: true
                    )
                }
                sh(script: "cd ./helloworld; ls -la;", returnStatus: true)
            }
            
        }
    }

}