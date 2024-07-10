package com.boa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boa.customer.*;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	// Crete / Update // delete / List operation 
	
	// Cutome // JPQL 
}
