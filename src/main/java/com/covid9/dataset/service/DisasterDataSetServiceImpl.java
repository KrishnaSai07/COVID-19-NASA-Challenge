package com.covid9.dataset.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid9.dataset.model.DisasterDataSet;
import com.covid9.dataset.repository.DisasterDataSetRepository;

@Service
public class DisasterDataSetServiceImpl implements DisasterDataSetService {
	
	@Autowired
    private DisasterDataSetRepository disasterDataSetRepository;
	@Override
	public List<DisasterDataSet> findAll() {
		// TODO Auto-generated method stub
		return disasterDataSetRepository.findAll();
	}

}
