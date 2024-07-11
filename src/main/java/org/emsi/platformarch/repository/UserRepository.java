package org.emsi.platformarch.repository;

import org.emsi.platformarch.entities.Userr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Userr, Long> {
    boolean existsByMail(String mail);
}
