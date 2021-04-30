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
        		sh 'mvn -f /home/kali/rabiixx/simple/pom.xml test'
        	}
        }
    }
}
