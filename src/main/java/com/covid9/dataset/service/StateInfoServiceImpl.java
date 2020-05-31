package com.covid9.dataset.service;
import org.springframework.stereotype.Service;
import java.util.List;

import com.covid9.dataset.model.StateInfo;
import com.covid9.dataset.repository.StateInfoRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StateInfoServiceImpl implements StateInfoService {

	@Autowired
	private StateInfoRepository stateInfoRepository;
	
	@Override
	public List<StateInfo> findAll() {
		// TODO Auto-generated method stub
		return stateInfoRepository.findAll();
	}

}
