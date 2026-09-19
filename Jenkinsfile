pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/DineshMeshram12/RestAssured.git'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {

        always {
            echo 'Build completed'
        }

        success {
            echo 'Tests Passed!'
        }

        failure {
            echo 'Tests Failed!'
        }
    }
}