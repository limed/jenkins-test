#!groovy

def utils = load 'Jenkinsfiles/util.groovy'

node {
  stage("Announce") {
    util.slack_notify([
      status: "Pushing to test",
      message: "Why should i test this out ${BUILD_NUMBER}"
    ])
  }
}
