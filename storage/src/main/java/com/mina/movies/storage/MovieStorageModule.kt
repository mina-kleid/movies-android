package com.mina.movies.storage

import android.app.Application
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
public object MovieStorageModule {

    @Provides
    @Reusable
    fun movieRepository(application: Application): MovieFavoriteRepository {
        val movieDao = MovieDatabaseBuilder(application = application)
            .build()
            .movieDao()
       return MovieFavoriteRepositoryImpl(movieDao = movieDao)
    }

}