package com.sda.learnjava.learnjava.model;

import lombok.Getter;


public enum RoleType {

    USER("ROLE_USER"), ADMIN("ROLE_ADMIN");

    private String roleName;

    RoleType(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
