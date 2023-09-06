package com.rishu.customapplicationproperties;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserManagementRepository extends JpaRepository<UserAccount, Long> {}
