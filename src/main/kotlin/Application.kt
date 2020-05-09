import javax.inject.Inject

class Application @Inject constructor(private val component: AppComponent) {
//    init {
//        DaggerAppComponent.factory().create(this)
//    }

    fun start() {
        println("Application:start $component")
        val hoge = DaggerAppComponent.factory().create().hoge()
        println("Application:start $hoge")
    }
}

class Hoge @Inject constructor() {

}