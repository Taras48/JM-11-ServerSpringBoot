package com.server.dao;

import com.server.model.Role;

public interface RoleRepository {

    Role findAllByRole(String role);

}