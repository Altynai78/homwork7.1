package com.example.cleanarch1.domein.usecases

import com.example.cleanarch1.domein.models.Music
import com.example.cleanarch1.domein.repositories.MusicRepository


class DeleteMusicUseCase @Inject constructor(
    private val musicRepository: MusicRepository
) {
    fun deleteMusic(music: Music) {
        musicRepository.deleteMusic(music)
    }
}