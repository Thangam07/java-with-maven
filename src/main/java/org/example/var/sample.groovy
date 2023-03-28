def call(body) {
    def myVar = 'Hello, World!'
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    echo myVar
    echo "This is my custom step. Config value: ${config.myConfigValue}"
}
