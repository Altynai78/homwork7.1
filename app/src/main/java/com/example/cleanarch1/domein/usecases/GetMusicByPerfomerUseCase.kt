package com.example.cleanarch1.domein.usecases

import com.example.cleanarch1.domein.models.Music
import com.example.cleanarch1.domein.repositories.MusicRepository
import kotlinx.coroutines.flow.Flow

class GetMusicByPerfomerUseCase

@Inject constructor(
    private val musicRepository: MusicRepository
) {
    fun getMusicByPerfomer(): Flow<Resource<List<Music>>> {
        return musicRepository.getMusicByPerfomer()
    }
}