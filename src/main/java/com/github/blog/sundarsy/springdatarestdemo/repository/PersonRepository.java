package com.github.blog.sundarsy.springdatarestdemo.repository;

import com.github.blog.sundarsy.springdatarestdemo.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by rg3 on 5/23/17.
 */
@Repository
@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository extends CrudRepository<Person, Long> {
}
