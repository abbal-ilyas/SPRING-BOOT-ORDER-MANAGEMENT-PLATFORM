package com.gestion.App.Demande;

import org.springframework.data.jpa.repository.JpaRepository;


public interface DemandeRepository extends JpaRepository<Demande, Long> {
    }