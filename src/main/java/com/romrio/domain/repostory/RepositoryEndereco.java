package com.romrio.domain.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.romrio.domain.Endereco;
@Repository
public interface RepositoryEndereco extends JpaRepository<Endereco, Integer> {
@Query(value="select * from endereco where id = ?",nativeQuery = true )
Endereco findAll(Integer id);
	
}
