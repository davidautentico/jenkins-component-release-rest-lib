def httpGet(Map args) {
    def response = args.jenkinsWorkflowScript.invokeMethod 'httpRequest', [[(args.url): url]] as Object[]
    if (response.status != 200) {
        jenkinsWorkflowScript.invokeMethod 'echo', [response.content] as Object[]
    }
    response.content
}
