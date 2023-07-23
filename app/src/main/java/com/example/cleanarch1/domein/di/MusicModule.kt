package com.example.cleanarch1.domein.di

import android.content.Context
import com.example.cleanarch1.data.local.MusicDao
import com.example.cleanarch1.data.local.MusicDataBase
import com.example.cleanarch1.data.repositories.MusicRepositoryImpl


@Module
@InstallIn(SingletonComponent::class)
object MusicModule {

    @Singleton
    @Provides
    fun provideMusicDataBase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        MusicDataBase::class.java,
        "musics"
    )

    @Provides
    fun provideMusicDao(musicDataBase: MusicDataBase) = musicDataBase.musicDao()

    @Provides
    fun provideMusicRepository(musicDao: MusicDao) = MusicRepositoryImpl(musicDao)
}