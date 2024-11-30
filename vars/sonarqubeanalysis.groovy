def call() {
    withSonarQubeEnv('sonar-server') {
        sh ''' $SCANNER_HOME/bin/sonar-server -Dsonar.projectName=YpuTube-app -Dsonar.projectkey=YouTube-app '''
    }
}