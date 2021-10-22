package com.romrio.domain.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.romrio.domain.Morador;
@Repository
public interface RepositoryMorador extends JpaRepository<Morador, Integer> {
@Query(value="select*from morador where id = ?",nativeQuery = true )
Morador find (Integer id);
	
}
