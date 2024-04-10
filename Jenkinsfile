pipeline {
    agent any
    tools {
        maven 'MAVEN_HOME'
    }
 
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/AmruthaParwatikar/JenkinsProj.git'
            }
        }
 
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
 
        stage('Test') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Deploy') {
            steps {
                bat 'java -jar target/SpringApplication-0.0.1-SNAPSHOT.jar'
            }
        }
    }
 
    post {
        success {
            echo 'Build succeeded!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
