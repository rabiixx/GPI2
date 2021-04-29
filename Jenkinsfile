pipeline {
    stages {
        stage('Build') {
            steps {
                sh 'cd /home/rabiixx/repos/GPI2/MyArduinoProject/src/BlinkProject && make'
            }
        }
        stage('Upload') {
            steps {
                sh 'cd /home/rabiixx/repos/GPI2/MyArduinoProject/src/BlinkProject && make upload'
            }       
        }
    }
}