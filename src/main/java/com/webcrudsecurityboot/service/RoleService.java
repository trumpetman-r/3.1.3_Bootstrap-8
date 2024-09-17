package com.webcrudsecurityboot.service;

import com.webcrudsecurityboot.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    Role getRoleById(Long id);
    void saveRole(Role role);
    void updateRole(Role role);
    void deleteRoleById(Long id);
}