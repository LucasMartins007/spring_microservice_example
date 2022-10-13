package com.lucas.git.repository;

import com.lucas.git.model.Loan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoansRepository extends CrudRepository<Loan, Integer> {

    List<Loan> findByCustomerIdOrderByStartDateDesc(Integer customerId);

}
