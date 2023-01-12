package com.ict.group09.travelwala.sercurity.service;


import com.ict.group09.travelwala.sercurity.dto.oauth2.OAuth2UserInfo;
import com.ict.group09.travelwala.sercurity.exception.UserAlreadyExistException;
import com.ict.group09.travelwala.sercurity.dto.AppUserRegisterRequest;
import com.ict.group09.travelwala.sercurity.dto.AppUserRegisterResponse;
import com.ict.group09.travelwala.sercurity.entity.AppUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface AppUserService {
    AppUserRegisterResponse register(AppUserRegisterRequest user) throws UserAlreadyExistException;
    void confirmToken(String token) throws IllegalStateException;

    void sendConfirmToken(String token, String to);

    void enableAppUser(String accountName);

    Boolean existsByEmail(String email);

    AppUser findByEmail(String email);

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    void createOauth2User(OAuth2UserInfo user);
}
