pipeline {
	agent any
	stages {
		stage('Build Jar'){
			steps{
				sh 'ls'
				sh 'mvn clean install'
			}
		}
	stage(Run Jar) {
			steps{
				sh 'ls'
				sh 'java -jar target/GardeningProject-0.0.1-SNAPSHOT.jar &'
				}
		}
	}

}
