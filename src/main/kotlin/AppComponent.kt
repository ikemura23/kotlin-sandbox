import dagger.Component

@Component
interface AppComponent {
    // Component.Factoryパターン
    @Component.Factory
    interface Factory {
        fun create(
        ): AppComponent
    }
}