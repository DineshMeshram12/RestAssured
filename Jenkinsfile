pipeline {
	agent any
	
	stages {
		
		stage('checkout'){
			steps {
				
				git branch: 'main',
				 url:'https://github.com/DineshMeshram12/RestAssured.git'
			}
		}
		
		stage('build'){
			steps {
				bat 'mvn clean test'
			}
		}
	}
	
	post {
		always{
			junit 'target/surefire-reports/*.xml'
		}
		
		success {
			echo 'test passed successfully!'
		}
		
		failure{
			echo 'Tests Failed!'
		}
	}
}