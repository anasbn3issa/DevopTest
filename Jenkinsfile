pipeline {
    agent any
    stages {
        stage('test mvn') {
            steps {
                echo 'mvn --version'
                sh """ mvn clean install """;
                sh """ mvn clean test """;
                echo 'tik tak 10'
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