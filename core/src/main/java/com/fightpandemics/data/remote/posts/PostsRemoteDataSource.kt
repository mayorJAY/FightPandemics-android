package com.fightpandemics.data.remote.posts

import com.fightpandemics.data.model.posts.Post
import com.fightpandemics.data.model.posts.Posts

interface PostsRemoteDataSource {

    suspend fun fetchPosts(): Posts
    suspend fun fetchPosts(objective: String?): List<Post>
}