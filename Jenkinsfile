pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                // Clean the Maven project
                bat 'mvn clean'
            }
        }
    }

    post {
        success {
            // Actions to perform when the pipeline succeeds (e.g., notifications)
            echo 'Pipeline succeeded!'
        }
        failure {
            // Actions to perform when the pipeline fails (e.g., notifications)
            echo 'Pipeline failed!'
        }
    }
}
