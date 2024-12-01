def call() {
    sh 'trivy image zaifar/youtube:latest > trivyimagescan.txt'
}