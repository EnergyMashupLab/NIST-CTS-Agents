package org.theenergymashuplab.cts.repository;

import org.theenergymashuplab.cts.model.EiUsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EiUserRepository extends JpaRepository<EiUsersModel, Long>  {

}