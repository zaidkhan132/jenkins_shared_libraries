def call(String dockerHubUsername, String imageName) {
    sh "docker build --build-arg REACT_APP_RAPID_API_KEY=8f7b217d97mshcf8792a771e4f09p1e5c98jsn4b4859d3a21d -t youtube ."
    sh "docker tag ${imageName} ${dockerHubUsername}/${imageName}:latest"
    withDockerRegistry([url: 'https:/index.docker.io/v1/', credentialsId: 'docker-cred'])
    sh "docker push ${dockerHubUsername}/${imageName}:latest"
}
