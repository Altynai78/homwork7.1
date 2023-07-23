package com.example.cleanarch1.data.models


@Entity(tableName = "musics")
data class MusicEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val perfomer: String,
    val album: String,
    val duration: String
)