package com.romrio.domain.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.romrio.domain.Apartamento;
@Repository
public interface RepositoryApartamento extends JpaRepository<Apartamento, Integer> {
@Query(value="select*from apartamento where id = ?",nativeQuery = true )
Apartamento find(Integer id);
	
}
