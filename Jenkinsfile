pipeline {
    agent any
    stages {
        stage('test mvn') {
            steps {
                echo 'mvn --version'
                echo 'tik tak 7'
            }
        }
    }
    post {
        failure {
            emailext body: 'Build FAILED',
                subject: 'Build FAILED',
                to: 'mohamedanas.benaissa@esprit.tn'
        }
    }
}