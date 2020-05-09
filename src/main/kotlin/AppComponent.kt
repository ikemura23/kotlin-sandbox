import dagger.BindsInstance
import dagger.Component
import javax.inject.Provider

@Component
interface AppComponent {
    // Component.Factoryパターン
    @Component.Factory
    interface Factory {
        fun create(): AppComponent
    }

    // 取得方法1
    fun hoge(): Hoge

    // 取得方法2
    fun hogeProvider(): Provider<Hoge>
}