import dagger.Binds
import dagger.Module
import dagger.Provides

// interfaceパターン
@Module
interface AppModule {
    @Binds
    fun provideHoge(hoge: Hoge): IHoge
}

// objectパターン
@Module
object HogeModule {
//    @JvmStatic
//    @Provides
//     fun provideHoge(): IHoge {
//        return Hoge()
//    }
}

// classパターン
@Module
class InterfaceModule {
    @Provides
    fun provideFuga(hoge: Hoge): Fuga {
        return Fuga(hoge)
    }
}

// abstract classパターン
@Module
abstract class AbstractModule {
//    companion object {
//        @Provides // @JvmStaticが不要になる
//        fun provideHoge(): IHoge = Hoge()
//    }
}