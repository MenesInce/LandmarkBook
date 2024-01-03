package com.menesince.landmarkbookkotlin.di

import com.menesince.landmarkbookkotlin.data.datasource.LandmarkDataSource
import com.menesince.landmarkbookkotlin.data.repo.LandmarkRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideLandmarkDataSource() : LandmarkDataSource {
        return LandmarkDataSource()
    }

    @Provides
    @Singleton
    fun provideLandmarkRepository(lds : LandmarkDataSource) : LandmarkRepository {
        return LandmarkRepository(lds)
    }
}