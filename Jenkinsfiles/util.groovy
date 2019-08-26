
def notify_slack(Map args) {
    def command = "${env.WORKSPACE}/scripts/slack-notify.sh"
    for (arg in args) {
        command += " --${arg.key} '${arg.value}'"
    }

    withCredentials([string(credentialsId: 'slack-hook', variable: 'HOOK')]) {
        sh '''
        command --hook "${HOOK}"
        '''
    }
}
