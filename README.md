# oauth-server

Basic Authorization Server implemnted with Spring cloud security and Cloud Oauth2.

We can generate access token from this server.

http://localhost:8080/oauth/token

Basic Auth: web/webpass
Request Body: username/password/grant_type/scope

Response:

{
    "access_token": "bb06d2d1-78a9-4627-82af-de7efb0a5f7d",
    "token_type": "bearer",
    "expires_in": 3599,
    "scope": "READ"
}
