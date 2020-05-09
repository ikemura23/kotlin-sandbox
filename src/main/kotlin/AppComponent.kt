import dagger.BindsInstance
import dagger.Component
import javax.inject.Provider

@Component(
    modules = [
        AppModule::class,
        HogeModule::class,
        InterfaceModule::class
    ]
)
interface AppComponent {
    // Component.Factoryパターン
    @Component.Factory
    interface Factory {
        fun create(): AppComponent
    }

    fun hoge(): Hoge

    fun hogeProvider(): Provider<Hoge>

    fun application(): Application
}