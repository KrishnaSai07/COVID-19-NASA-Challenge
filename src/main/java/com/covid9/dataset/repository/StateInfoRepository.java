package com.covid9.dataset.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid9.dataset.model.StateInfo;
import com.covid9.dataset.model.UnitedStatesDataSet;

@Repository
public interface StateInfoRepository extends JpaRepository<StateInfo,Integer> {
	
	List<StateInfo> findAll();

}
