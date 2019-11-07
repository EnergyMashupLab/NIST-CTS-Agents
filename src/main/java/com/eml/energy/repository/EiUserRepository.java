package com.eml.energy.repository;

import com.eml.energy.model.EiUsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EiUserRepository extends JpaRepository<EiUsersModel, Long>  {

}