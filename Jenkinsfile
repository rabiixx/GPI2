pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
            	sh 'make -C /home/kali/rabiixx/GPI2/MyArduinoProject/src/BlinkProject'
            }
        }
        stage('Test') {
        	steps {
        		dir('/home/kali/rabiixx/GPI2/simple') {
        			sh 'mvn test'
        		}
        	}
        }
    }
}
