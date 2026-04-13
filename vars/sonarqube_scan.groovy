def call() {
    def scannerHome = tool 'SonarScanner'
    
    withSonarQubeEnv('Sonar') {
        sh """
        ${scannerHome}/bin/sonar-scanner \
        -Dsonar.projectKey=wanderlust \
        -Dsonar.projectName=wanderlust \
        -Dsonar.sources=.
        """
    }
}
