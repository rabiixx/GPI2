pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
            	dir('MyArduinoProject/src/BlinkProject && make') {
                	sh 'make'
            	}
            }
        }
        stage('Upload') {
            steps {
                sh 'cd MyArduinoProject/src/BlinkProject && make upload'
            }       
        }
    }
}
