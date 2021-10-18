package com.effectivejava.chapter1.item1;

import java.util.HashMap;
import java.util.Map;

public final class Permission {

    private static final Map<String, Permission> permissionMap = new HashMap<>();
    private final Role role;
    private final int leve;

    private Permission(Role role, int leve) {
        this.role = role;
        this.leve = leve;
    }

    // Vantagem 2: Ao contrário dos construtores, não precisam criar um novo objeto sempre que invocados
    public static Permission permissionTypeFactory(Role role, int level) {
        Permission permission = permissionMap.get(role.name());

        if (permission == null) {
            permission = new Permission(role, 1);
            permissionMap.put(role.name(), permission);
        }
        return permission;
    }

    public enum Role {
        TEAM_MEMBER, TECH_LEAD, MANAGER
    }

}
