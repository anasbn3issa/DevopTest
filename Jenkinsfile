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
        stage('test with mock') {
            steps {
                echo 'mvn --version'
                sh """ mvn clean install """;
                sh """ mvn clean test """;
                echo 'tik tak 10'
            }
        }
        stage('sonar commands') {
            steps {
                echo 'sonar commands'
                sh """ mvn sonar:sonar   -Dsonar.projectKey=cicidpipeline   -Dsonar.host.url=http://localhost:9000   -Dsonar.login=c64ffdd44c75185f1a0f9357131d59e4675414f8
 """
            }

        }
    }
    post {
        always {  
             echo 'This will always run'  
         }  
        failure {  
             mail bcc: '', body: "<b>BUILD FAILED</b>", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html',  subject: "BUILD FAILED", to: "mohamedanas.benaissa@esprit.tn";  
         }  
    }
}
