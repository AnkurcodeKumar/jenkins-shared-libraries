def call() {
    withSonarQubeEnv('Sonar') {
        sh '''
        sonar-scanner \
        -Dsonar.projectKey=my-project \
        -Dsonar.sources=. \
        '''
    }
}
