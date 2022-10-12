package com.example.mykotlinfirstapp.api

import com.example.mykotlinfirstapp.model.UsersRequest
import com.example.mykotlinfirstapp.model.UsersResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi {

     @POST("/users/signup")
    fun signUp(@Body usersRequest: UsersRequest) : Response<UsersResponse>

    @POST("/users/singin")
    fun signIn(@Body usersRequest: UsersRequest) : Response<UsersResponse>
}