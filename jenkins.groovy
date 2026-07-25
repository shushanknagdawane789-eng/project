pipeline {
    agent any
    stages {
        stage('PULL'){
            steps{
                git branch: 'main', url: 'https://github.com/mayurmwagh/flight-reservation-app.git'
            }
        }
        stage('BUILD'){
            steps {
                sh'''
                    cd frontend
                    npm install
                    npm run build
                '''
            }
        }
        stage('DEPLOY'){
            steps{
                sh'''
                cd frontend
                 shushank-project-bucket-2026
                '''
            }
        }
    }
    // post {
    //     success {
    //         echo 'Pipeline completed successfully!'
    //     }
    //     failure {
    //         echo 'Pipeline failed!'
    //     }
    //     always {
    //         cleanWs()
    //     }
    // }
}
