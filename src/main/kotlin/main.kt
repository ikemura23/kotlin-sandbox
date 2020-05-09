fun main(args: Array<String>) {
    val hoge1 = DaggerAppComponent.factory().create().hoge()
    println(hoge1)
    val hoge2 = DaggerAppComponent.factory().create().hogeProvider().get()
    println(hoge2)
}