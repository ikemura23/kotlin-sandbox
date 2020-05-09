import javax.inject.Inject

// コンストラクタパターン
class Application @Inject constructor(var fuga: Fuga) {

    // Injectパターン
    // @Inject lateinit var fuga: Fuga

    fun start() {
        println("Application:start $fuga.hoge")
    }
}

interface IHoge

class Hoge @Inject constructor() : IHoge {
}

class Fuga @Inject constructor(val hoge: Hoge) {
}