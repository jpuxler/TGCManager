/* Requires the Docker Pipeline plugin */
pipeline {
    agent any

    tools {
        maven 'Maven 3.6.3'
    }

    stages {
        stage('build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}