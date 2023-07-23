package com.example.cleanarch1.data.mappers


fun MusicEntity.toMusic() = Music(id, name, perfomer, album, duration)

fun Music.toMusicEntity() = MusicEntity(id, name, perfomer, album, duration)