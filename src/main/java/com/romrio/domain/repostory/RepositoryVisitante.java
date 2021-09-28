package com.romrio.domain.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.romrio.domain.Visitante;
@Repository
public interface RepositoryVisitante extends JpaRepository<Visitante, Integer> {
@Query(value="select*from visitante where id = ?",nativeQuery = true )
Visitante findAll(Integer id);
	
}
