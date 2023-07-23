package com.example.cleanarch1.domein.usecases

import com.example.cleanarch1.domein.models.Music
import com.example.cleanarch1.domein.repositories.MusicRepository

class AddMusicUseCase @Inject constructor(
    private val musicRepository : MusicRepository
) {

    fun addMusic(music: Music) {
        musicRepository.addMusic(music)
    }

}