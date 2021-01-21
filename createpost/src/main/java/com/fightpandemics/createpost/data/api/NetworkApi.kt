package com.fightpandemics.createpost.data.api

import com.fightpandemics.createpost.data.model.CreatePostRequest
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface NetworkApi {

//    @Headers("Cookie: _ga_T2Q9T05C9V=GS1.1.1609154444.9.1.1609154640.0; _ga=GA1.1.1519508297.1607889211; AWSALB=BRzWap6mxJsXf0JufTUt9WjLuSjBggF8eheqtFnTrjEK1K8LwEbgG2xbXYTc6yWG3w6Z6+Uidnir4g643fG9QJNbNneemiROK6PxulAtF7a92+UPaJ1XwjGgtvem; AWSALBCORS=BRzWap6mxJsXf0JufTUt9WjLuSjBggF8eheqtFnTrjEK1K8LwEbgG2xbXYTc6yWG3w6Z6+Uidnir4g643fG9QJNbNneemiROK6PxulAtF7a92+UPaJ1XwjGgtvem; io=lYcUq9Egx7PAcQ-UAJLi; token=eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InB4SGhhTTVZSTdJYVJwZThVbVVxdiJ9.eyJodHRwczovL3Byb2R1Y3Rpb24uZmlnaHRwYW5kZW1pY3MuY29tL21vbmdvX2lkIjoiNWYzOGIxZGM3MDRhMjUxNjAwOTExZDE4IiwiaXNzIjoiaHR0cHM6Ly9mcC1wcm9kdWN0aW9uLmV1LmF1dGgwLmNvbS8iLCJzdWIiOiJhdXRoMHw1ZjM4YjFjNzk0NjcxMjAwNjc1ZWE3ZGEiLCJhdWQiOlsiaHR0cHM6Ly9mcC1wcm9kdWN0aW9uLmV1LmF1dGgwLmNvbS9hcGkvdjIvIiwiaHR0cHM6Ly9mcC1wcm9kdWN0aW9uLmV1LmF1dGgwLmNvbS91c2VyaW5mbyJdLCJpYXQiOjE2MDkxMDUzNzYsImV4cCI6MTYwOTE5MTc3NiwiYXpwIjoialZWcXZleGNaWUNDMVpzZHV1eklHNlFEcHhiMVFQNm4iLCJzY29wZSI6Im9wZW5pZCBwcm9maWxlIGVtYWlsIGFkZHJlc3MgcGhvbmUgcmVhZDpjdXJyZW50X3VzZXIgdXBkYXRlOmN1cnJlbnRfdXNlcl9tZXRhZGF0YSBkZWxldGU6Y3VycmVudF91c2VyX21ldGFkYXRhIGNyZWF0ZTpjdXJyZW50X3VzZXJfbWV0YWRhdGEgY3JlYXRlOmN1cnJlbnRfdXNlcl9kZXZpY2VfY3JlZGVudGlhbHMgZGVsZXRlOmN1cnJlbnRfdXNlcl9kZXZpY2VfY3JlZGVudGlhbHMgdXBkYXRlOmN1cnJlbnRfdXNlcl9pZGVudGl0aWVzIiwiZ3R5IjoicGFzc3dvcmQifQ.ZcHYnKtDDPSdmEf1xACvF52mkLwN9aVanqV9lNgEq5OKuxiQi-eHp1G6Z7GemhdD9Ixi63Cqci50dTmeJk25XR6nj7SfoGI2Ccvu67GFaWZrrGusH-MGzZpK1UUr0KRJbTa8h8qH9tGQBgau_vFOh0_1gWY4IruVEhjXjPxOFx8TrFcLS54_iKb5zmSLlcnag5Yx04Am1MCNGYxwG5ud3YGOsLoKIDryeeHFhOTMp1cSpk2qE0Ww31RLfB_iSm4pQ3XzsqV492RNCMKt1CaCUHvBRs9_N6ocby-N8bNmxarGSqpIlQ2NsDV5_M_JA9wcFJwwhweFAZWg4dVpCCntNg; remember=-")
    @POST("api/posts")
    suspend fun createPost(@Body createPostRequest: CreatePostRequest): Response<*>

    companion object {
        const val STAGING_API_ENDPOINT = "https://staging.fightpandemics.work/"
        const val RELEASE_API_ENDPOINT = "https://fightpandemics.com/"
    }
}