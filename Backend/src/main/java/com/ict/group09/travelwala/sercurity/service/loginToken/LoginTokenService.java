package com.ict.group09.travelwala.sercurity.service.loginToken;

import com.ict.group09.travelwala.sercurity.entity.AppUser;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public interface LoginTokenService {
    LoginToken refreshToken(HttpServletRequest request) throws IOException;

    LoginToken createToken(AppUser user);
}
