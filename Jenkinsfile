pipeline {
	agent any
	stages {
		stage('Build Jar'){
			steps{
				sh 'ls'
				sh 'bash build.sh'
			}
		}
	stage('Run Jar') {
			steps{
				sh 'ls'
				sh 'java -jar target/GardeningProject-0.0.1-SNAPSHOT.jar &'
				}
		}
	}

}
