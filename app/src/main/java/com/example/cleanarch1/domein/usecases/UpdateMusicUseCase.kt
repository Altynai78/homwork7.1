package com.example.cleanarch1.domein.usecases

import com.example.cleanarch1.domein.models.Music
import com.example.cleanarch1.domein.repositories.MusicRepository


class UpdateMusicUseCase @Inject constructor(
    private val musicRepository: MusicRepository
) {
    fun updateMusic(music: Music) {
        musicRepository.updateMusic(music)
    }
}