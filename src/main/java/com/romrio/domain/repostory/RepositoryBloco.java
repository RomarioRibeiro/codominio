package com.romrio.domain.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.romrio.domain.Bloco;

@Repository
public interface RepositoryBloco extends JpaRepository<Bloco, Integer> {
	@Query(value = "select*from bloco where id = ?", nativeQuery = true)
	Bloco find(Integer id);

}
