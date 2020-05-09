fun main(args: Array<String>) {
    val application = DaggerAppComponent.factory().create().application()
    application.start()
}