pipeline {
    agent any
    tools {
    	maven 'maven'
    }
    stages {
        stage('Build') {
            steps {
            	sh 'make -C /home/kali/rabiixx/GPI2/MyArduinoProject/src/BlinkProject'
            }
        }
        stage('ValidateCode') {
        	steps {
        		sh 'mvn -f /home/kali/rabiixx/GPI2/simple/pom.xml site'
        	}
        }
        stage('Test') {
        	steps {
        		sh 'mvn -f /home/kali/rabiixx/GPI2/simple/pom.xml package'
        		sh "mvn -f /home/kali/rabiixx/GPI2/simple/pom.xml test"
        	}
        }
        stage('BuildAndroid') {
        	steps {
                dir('MyAndroidApplication'){
        		  sh './gradlwe :app:build'
                }
        	}
        }
    }
}
