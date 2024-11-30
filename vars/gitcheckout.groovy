def call(Srting guturl, String gitBranch) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: gitbranch]],
        userRemoteConfigs: [[url: giturl]]
    ])
}