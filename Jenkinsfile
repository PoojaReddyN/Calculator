pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                // Clean the Maven project
                bat 'mvn clean'
            }
        }
       /*  stage('Run Tests') {
            steps {
                // Run specific tests using Maven
                bat 'mvn test -Dtest=CalculatorUnitTesting'
            }
        }
        stage('Deploy') {
            when {
                // Skip this stage conditionally based on a predefined variable or condition
                expression { false }
            }
            steps {
                // Deploy step using Maven (will be skipped due to the when condition)
                bat 'mvn deploy'
                echo 'Deploy stage skipped'
            }
        } */
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
