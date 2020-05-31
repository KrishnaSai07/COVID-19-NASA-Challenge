package com.covid9.dataset.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid9.dataset.model.IndiaDataSet;
import com.covid9.dataset.repository.IndiaDataSetRepository;

@Service
public class IndiaDataSetServiceImpl implements IndiaDataSetService {

	@Autowired
	private IndiaDataSetRepository indiaDataSetRepository; 
	
	@Override
	public List<IndiaDataSet> findAll() {
		// TODO Auto-generated method stub
		return indiaDataSetRepository.findAll();
	}

}
