package com.example.cleanarch1.domein.repositories

import com.example.cleanarch1.domein.models.Music
import kotlinx.coroutines.flow.Flow

interface MusicRepository {
    fun addMusic(music: Music) : Flow<Resource<Unit>>

    fun getMusic(): Flow<Resource<List<Music>>>

    fun getMusicByPerfomer(): Flow<Resource<List<Music>>>

    fun getMusicByDuration(): Flow<Resource<List<Music>>>

    fun updateMusic(music: Music) : Flow<Resource<Unit>>

    fun deleteMusic(music: Music) : Flow<Resource<Unit>>
}