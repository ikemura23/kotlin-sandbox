import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Scope

// クラスのモジュール
@Module
interface AppModule {
    @Binds
    fun provideHoge(hoge: Hoge): IHoge
}

// objectのモジュール
@Module
object HogeModule {
//    @JvmStatic
//    @Provides
//     fun provideHoge(): IHoge {
//        return Hoge()
//    }
}

// interfaceのモジュール
@Module
class InterfaceModule {
    @Provides
    fun provideFuga(hoge: Hoge): Fuga {
        return Fuga(hoge)
    }
}
