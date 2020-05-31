package com.covid9.dataset.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.covid9.dataset.model.UnitedStatesDataSet;
import com.covid9.dataset.repository.UnitedStatesDataSetRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UnitedStatesDataSetServiceImpl implements UnitedStatesDataSetService {

	
	@Autowired
	private UnitedStatesDataSetRepository unitedStatesDataSetRepository;
	
	@Override
	public List<UnitedStatesDataSet> findAll() {
		// TODO Auto-generated method stub
		return unitedStatesDataSetRepository.findAll();
	}

}
