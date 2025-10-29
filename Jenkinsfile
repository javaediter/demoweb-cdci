pipeline{
    agent any

    tools{
        maven 'maven3'
    }

    stages{
        stage('Build'){
            steps{
                echo 'Building...'
                sh 'mvn clean install'
            }
        }

        stage('Test'){
            steps{
                echo 'Testing...'
                sh 'mvn test'
            }
        }
    }

    post{
        success{
            echo 'Hoy es ${date} and the author is ${params.author}'
        }
        failure{
            echo 'Failure!!!'
        }
    }
}
