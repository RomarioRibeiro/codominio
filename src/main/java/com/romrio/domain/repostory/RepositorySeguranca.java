package com.romrio.domain.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.romrio.domain.Seguranca;
@Repository
public interface RepositorySeguranca extends JpaRepository<Seguranca, Integer> {
@Query(value="select*from Seguranca where id = ?",nativeQuery = true )
Seguranca findAll(Integer id);
	
}
