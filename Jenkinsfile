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
        always {  
             echo 'This will always run'  
         }  
        failure {  
             mail bcc: '', body: "<b>BUILD FAILED</b>", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html',  subject: "BUILD FAILED", to: "mohamedanas.benaissa@esprit.tn";  
         }  
    }
}

 pipeline {  
     agent any  
     stages {  
         stage('Test') {  
             steps {  
                 sh 'echo "Fail!"; exit 1'  
             }  
         }  
     }  
     
 }