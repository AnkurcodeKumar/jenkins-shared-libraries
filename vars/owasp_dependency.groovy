def call() {
    dependencyCheck additionalArguments: '--scan .', odcInstallation: 'OWASP-DC'
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
