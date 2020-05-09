import dagger.Module
import dagger.Provides

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
//    fun provideHoge(): Hoge {
//        return Hoge()
//    }
}

// interfaceのモジュール
@Module
interface InterfaceModule {
//    @Provides
//    fun provideHoge(): Hoge {
//        return Hoge()
//    }
}
