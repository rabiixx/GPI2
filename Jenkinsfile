pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
            	dir('/home/kali/rabiixx/GPI2/MyArduinoProject/src/BlinkProject') {
                	sh 'pwd'
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
