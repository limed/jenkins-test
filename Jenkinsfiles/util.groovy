
def notify_slack(Map args, credential_id='slack-hook') {
    def command = "${env.WORKSPACE}/scripts/slack-notify.sh"
    withCredentials([string(credentialsId: credential_id, variable: 'HOOK')]) {
        for (arg in args) {
            command += " --${arg.key} '${arg.value}'"
        }
        command += " --hook '${HOOK}'"
        sh command
    }
}

return this;
