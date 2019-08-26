#!groovy


node {
  def utils = load 'Jenkinsfiles/util.groovy'

  stage("Announce") {
    utils.slack_notify([
      status: "Pushing to test",
      message: "Why should i test this out ${BUILD_NUMBER}"
    ])
  }

  stage("Cleanup") {
    cleanWs()
  }
}
