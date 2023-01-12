package com.ict.group09.travelwala.sercurity.dto.oauth2;


import com.ict.group09.travelwala.sercurity.entity.Provider;

import java.util.Map;

public class GoogleOAuth2UserInfo extends OAuth2UserInfo {

    public GoogleOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

    @Override
    public String getId() {
        return (String) attributes.get("sub");
    }

    @Override
    public Provider getProvider() {
        return Provider.google;
    }

    @Override
    public String getFirstName() {
        return (String) attributes.get("family_name");
    }
    @Override
    public String getLastName() {
        return (String) attributes.get("given_name");
    }
    @Override
    public String getEmail() {
        return (String) attributes.get("email");
    }

    @Override
    public String getImageUrl() {
        return (String) attributes.get("picture");
    }
}