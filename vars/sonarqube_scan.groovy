def call() {
    withSonarQubeEnv('sonarqube-server') {
        sh '''
        sonar-scanner \
        -Dsonar.projectKey=my-project \
        -Dsonar.sources=. \
        '''
    }
}
