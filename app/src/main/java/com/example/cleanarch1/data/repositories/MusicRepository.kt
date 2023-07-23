package com.example.cleanarch1.data.repositories

import com.example.cleanarch1.data.local.MusicDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.internal.NopCollector.emit


class MusicRepositoryImpl @Inject constructor(
    private val musicDao: MusicDao
): MusicRepository {
    override fun addMusic(music: Music): Flow<Resource<Unit>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = musicDao.addMusic(music.toMusicEntity())
                emit(Resource.Success(data))
            }catch (e : java.lang.Exception) {
                emit(Resource.Error(e.localizedMessage?: "unknown error"))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun getMusic(): Flow<Resource<List<Music>>> {
        return flow {
            emit(Resource.Loading())
            try {
                val list = musicDao.getMusic()
                val data = list.map { it.toMusic() }
                emit(Resource.Success(data))
            } catch (e: java.lang.Exception) {
                emit(Resource.Error(e.localizedMessage ?: "unknown error"))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun getMusicByPerfomer(): Flow<Resource<List<Music>>> {
        return flow {
            emit(Resource.Loading())
            try {
                val list = musicDao.getMusicByPerfomer()
                val data = list.map { it.toMusic() }
                emit(Resource.Success(data))
            } catch (e: java.lang.Exception) {
                emit(Resource.Error(e.localizedMessage ?: "unknown error"))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun getMusicByDuration(): Flow<Resource<List<Music>>> {
        return flow {
            emit(Resource.Loading())
            try {
                val list = musicDao.getMusicByDuration()
                val data = list.map { it.toMusic() }
                emit(Resource.Success(data))
            } catch (e: java.lang.Exception) {
                emit(Resource.Error(e.localizedMessage ?: "unknown error"))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun updateMusic(music: Music): Flow<Resource<Unit>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = musicDao.updateMusic(music.toMusicEntity())
                emit(Resource.Success(data))
            }catch (e : java.lang.Exception) {
                emit(Resource.Error(e.localizedMessage?: "unknown error"))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun deleteMusic(music: Music): Flow<Resource<Unit>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = musicDao.deleteMusic(music.toMusicEntity())
                emit(Resource.Success(data))
            }catch (e : java.lang.Exception) {
                emit(Resource.Error(e.localizedMessage?: "unknown error"))
            }
        }.flowOn(Dispatchers.IO)
    }


}