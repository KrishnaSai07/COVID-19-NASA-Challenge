package com.covid9.dataset.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid9.dataset.model.IndiaDataSet;
import com.covid9.dataset.model.UnitedStatesDataSet;

@Repository
public interface UnitedStatesDataSetRepository extends JpaRepository<UnitedStatesDataSet,Integer>  {

	List<UnitedStatesDataSet> findAll();
}
