package com.api.NutriAcess.repositories;


import com.api.NutriAcess.models.FaleConoscoModel;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaleConoscoRepository extends JpaRepository<FaleConoscoModel, UUID>{

}
