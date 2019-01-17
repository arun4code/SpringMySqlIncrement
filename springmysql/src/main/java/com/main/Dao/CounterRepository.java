package com.main.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.main.model.Counter;


/**
 * @author arun
 *
 */
@Repository
public interface CounterRepository extends JpaRepository<Counter, Long> {

}
