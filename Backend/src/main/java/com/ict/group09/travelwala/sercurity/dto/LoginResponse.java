package com.ict.group09.travelwala.sercurity.dto;

import com.ict.group09.travelwala.sercurity.service.loginToken.LoginToken;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponse {
    LoginToken loginToken;
    UserLoginResponse user;
}
