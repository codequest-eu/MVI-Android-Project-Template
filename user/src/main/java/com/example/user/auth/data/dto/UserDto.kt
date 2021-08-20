package com.example.user.auth.data.dto

import com.squareup.moshi.Json
import moe.banana.jsonapi2.JsonApi
import moe.banana.jsonapi2.Resource

@JsonApi(type = "user")
data class UserDto(
    @field:Json(name = "first_name") val firstName: String = "",
    @field:Json(name = "last_name") val lastName: String = ""
) : Resource()
