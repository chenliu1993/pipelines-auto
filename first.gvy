pipeline {
    agent any
    stages {
        stage("Source Checkout"){
            git branch:  'topic/cliu2/initialize', url: 'https://gitlab.eng.vmware.com/cliu2/lcm-auto-pipelines.git'
        }
    }

}