package com.lucas.git.repository;

import com.lucas.git.model.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends CrudRepository<Card, Integer> {

    List<Card> findByCustomerId(Integer customerId);

}
