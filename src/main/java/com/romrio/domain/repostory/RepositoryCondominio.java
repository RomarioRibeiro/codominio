package com.romrio.domain.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.romrio.domain.Condominio;
@Repository
public interface RepositoryCondominio extends JpaRepository<Condominio, Integer> {
@Query(value="select*from condominio where id = ?",nativeQuery = true )
Condominio find(Integer id);
	
}
