package edu.itu.cavabunga.core.repository;

import edu.itu.cavabunga.core.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
    Optional<Property> findById(Long Id);
}
