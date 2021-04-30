pipeline {
    stages {
        stage('Build') {
            steps {
                sh 'cd MyArduinoProject/src/BlinkProject && make'
            }
        }
        stage('Upload') {
            steps {
                sh 'cd MyArduinoProject/src/BlinkProject && make upload'
            }       
        }
    }
}
