import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Scope

// クラスのモジュール
@Module
class AppModule {
    @Provides
    fun provideHoge(): Hoge {
        return Hoge()
    }

    @Provides
    fun provideFuga(hoge: Hoge): Fuga {
        return Fuga(hoge)
    }
}

// objectのモジュール
@Module
object HogeModule {
//    @JvmStatic
//    @Provides
//    internal fun provideHoge(): Hoge {
//        return Hoge()
//    }
}

// interfaceのモジュール
@Module
abstract class InterfaceModule {
//    @Binds
//    abstract fun provideFuga(hoge: Hoge): Fuga
}
