pipeline {
    agent any

    stages {
        stage('Check Source') {
            steps {
                git url: "https://github.com/chenliu1993/pipelines-auto.git",
                branch: "topic/cliu2/initialize"
            }
        }
    }
}