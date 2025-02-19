package com.backend.springsecurity.controllers.dto;

public record LoginResponse(String acessToken, Long expiresIn) {

}
