def call() {
    sh 'docker run -d --name youtube -p 3000:3000 zaifar/youtube:latest'
}