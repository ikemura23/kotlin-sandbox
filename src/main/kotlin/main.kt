fun main(args: Array<String>) {
    val application = DaggerAppComponent.factory().create().application()
    application.start()
    // hogeの取得
    val hoge = DaggerAppComponent.factory().create().hoge()
    val fuga = DaggerAppComponent.factory().create().fugaProvider().get()
}