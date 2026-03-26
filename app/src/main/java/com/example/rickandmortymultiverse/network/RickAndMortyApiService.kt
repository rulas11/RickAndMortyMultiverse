package com.example.rickandmortymultiverse.network
import com.example.rickandmortymultiverse.model.CharacterResponse
import retrofit2.http.GET

interface RickAndMortyApiService {
    @GET("character")
    suspend fun getCharacters(): CharacterResponse
}