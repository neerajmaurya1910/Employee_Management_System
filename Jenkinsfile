pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/neerajmaurya1910/Employee_Management_System.git'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t myproject .'
            }
        }

        stage('Run Docker Container') {
            steps {
                sh 'docker run --rm myproject'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}