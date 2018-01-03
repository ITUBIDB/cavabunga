package edu.itu.cavabunga.core.repository;

import edu.itu.cavabunga.core.entity.Component;
import edu.itu.cavabunga.core.entity.Participant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@org.springframework.stereotype.Component
public interface ComponentRepository extends CrudRepository<Component, Long> {
    Component findById (Long id);

    //Calendar component's parent_id column will be null(componentToComponentMap attribute)
    List<Component> findByOwnerAndComponentToComponentMapIsNull(Participant owner);

    List<Component> findByOwner(Participant owner);

    List<Component> findByComponentTypeAndOwner(String componentType, Participant owner);
}
