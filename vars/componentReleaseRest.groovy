def httpGet(Map args) {
    println args
    def response = args.jenkinsWorkflowScript.invokeMethod 'httpRequest', [[url: args.url] as Object[]
    if (response.status != 200) {
        jenkinsWorkflowScript.invokeMethod 'echo', [response.content] as Object[]
    }
    response.content
}
