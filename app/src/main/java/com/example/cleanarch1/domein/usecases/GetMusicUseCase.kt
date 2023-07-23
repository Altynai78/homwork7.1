package com.example.cleanarch1.domein.usecases

import com.example.cleanarch1.domein.models.Music
import com.example.cleanarch1.domein.repositories.MusicRepository
import kotlinx.coroutines.flow.Flow

class GetMusicUseCase @Inject constructor(
    private val musicRepository : MusicRepository
) {
    fun getMusic(): Flow<Resource<List<Music>>> {
        return musicRepository.getMusic()
    }
}