package com.example.user.auth.data.dto

import com.squareup.moshi.Json
import moe.banana.jsonapi2.JsonApi
import moe.banana.jsonapi2.Resource

@JsonApi(type = "session")
data class SessionDto(
    @field:Json(name = "access_token") val access_token: String = "",
    @field:Json(name = "refresh_token") val refresh_token: String = ""
) : Resource()