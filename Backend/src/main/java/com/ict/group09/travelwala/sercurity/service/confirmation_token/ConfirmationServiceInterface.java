package com.ict.group09.travelwala.sercurity.service.confirmation_token;



import com.ict.group09.travelwala.sercurity.entity.AppUser;
import com.ict.group09.travelwala.sercurity.entity.ConfirmationToken;

import java.util.Optional;

public interface ConfirmationServiceInterface {
    ConfirmationToken createConformationToken(AppUser userEntity);

    void updateConfirmedAt(ConfirmationToken token);

    Optional<ConfirmationToken> findConfirmationToken(String token);
}
