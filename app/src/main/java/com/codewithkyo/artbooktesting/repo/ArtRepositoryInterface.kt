package com.codewithkyo.artbooktesting.repo

import androidx.lifecycle.LiveData
import com.codewithkyo.artbooktesting.model.ImageResponse
import com.codewithkyo.artbooktesting.roomdb.Art
import com.codewithkyo.artbooktesting.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art: Art)

    suspend fun deleteArt(art: Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage(imageString : String) : Resource<ImageResponse>

}