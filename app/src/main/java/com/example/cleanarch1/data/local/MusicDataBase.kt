package com.example.cleanarch1.data.local

@Database(entities = [MusicEntity::class], version = 1)
abstract class MusicDataBase: RoomDatabase() {
    abstract fun musicDao(): MusicDao
}