package com.example.mykotlinfirstapp.api

import com.cheezycode.notesample.models.UserRequest
import com.cheezycode.notesample.models.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi {

     @POST("/users/signup")
   suspend fun signUp(@Body usersRequest: UserRequest) : Response<UserResponse>

    @POST("/users/singin")
  suspend fun signIn(@Body usersRequest: UserRequest) : Response<UserResponse>
}