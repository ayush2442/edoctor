package com.infosys.eDoctor.reposatory;

import com.infosys.eDoctor.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<Users, String> {

}