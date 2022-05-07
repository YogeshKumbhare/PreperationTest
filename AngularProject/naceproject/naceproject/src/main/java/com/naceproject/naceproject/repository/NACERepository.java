package com.naceproject.naceproject.repository;

import com.naceproject.naceproject.model.Nace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NACERepository extends JpaRepository<Nace, Integer> {
}
