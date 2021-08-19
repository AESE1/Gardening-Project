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
				sh 'bash deploy.sh'
				}
		}
	}

}
