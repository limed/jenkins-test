#!groovy


node {

  stage("Checkout") {
    checkout scm
  }

  stage("Announce") {
    def utils = load 'Jenkinsfiles/util.groovy'
    utils.notify_slack([
      status: "Pushing to test",
      message: "Why should i test this out ${BUILD_NUMBER}"
    ])
  }

  stage("Cleanup") {
    cleanWs()
  }
}
