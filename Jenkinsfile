pipeline {

    agent any

    stages {

        stage('Get Request Test') {
            steps {
                bat 'mvn clean test -Dtest=GetRequest'
            }
        }
    }

    post {

        always {
            junit 'test-output/junitreports/*.xml'
        }

        success {
            echo 'GetRequest test passed!'
        }

        failure {
            echo 'GetRequest test failed!'
        }
    }
}