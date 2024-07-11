package org.emsi.platformarch.repository;

import org.emsi.platformarch.entities.Charges;
import org.emsi.platformarch.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ChargeRepository extends JpaRepository<Charges, String> {

}
