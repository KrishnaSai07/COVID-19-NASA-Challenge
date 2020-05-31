package com.covid9.dataset.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid9.dataset.model.IndiaDataSet;

@Repository
public interface IndiaDataSetRepository extends JpaRepository<IndiaDataSet,Integer> {
	
	List<IndiaDataSet> findAll();
}
