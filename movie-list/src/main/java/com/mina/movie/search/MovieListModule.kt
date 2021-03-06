package com.mina.movie.search

import androidx.fragment.app.Fragment
import com.mina.movie.item.MovieListItemClickListener
import com.mina.movie.item.MovieListItemSwipeListener
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
internal object MovieListModule {

    @Provides
    fun itemClickListener(fragment: Fragment): MovieListItemClickListener =
        fragment as MovieListItemClickListener

    @Provides
    fun itemSwipeListener(fragment: Fragment): MovieListItemSwipeListener =
        fragment as MovieListItemSwipeListener
}