def call() {
    withSonarQubeEnv('sonar-server') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=YouTube-app -Dsonar.projectkey=YouTube-app '''
    }
}
