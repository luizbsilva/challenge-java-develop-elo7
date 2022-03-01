package com.challenge.elo7.domain.enums;

public enum ProfileEnum {
    ROLE_USER(0),
    ROLE_ADMIN(1);


    ProfileEnum(int codeRole) {
    }

    public static ProfileEnum fromInteger(int codeRole) {
        switch (codeRole) {

            case 1:
                return ProfileEnum.ROLE_ADMIN;
        }
        return ROLE_USER;
    }
}
