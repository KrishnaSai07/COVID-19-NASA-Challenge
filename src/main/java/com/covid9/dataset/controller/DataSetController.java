package com.covid9.dataset.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid9.dataset.model.DisasterDataSet;
import com.covid9.dataset.model.IndiaDataSet;
import com.covid9.dataset.model.StateInfo;
import com.covid9.dataset.model.UnitedStatesDataSet;
import com.covid9.dataset.service.DisasterDataSetService;
import com.covid9.dataset.service.IndiaDataSetService;
import com.covid9.dataset.service.StateInfoService;
import com.covid9.dataset.service.UnitedStatesDataSetService;

@CrossOrigin
@RestController
public class DataSetController {

	@Autowired
	private IndiaDataSetService indiaDataSetService;
	
	@Autowired
	private DisasterDataSetService disasterDataSetService;
	
	@Autowired
	private UnitedStatesDataSetService unitedStatesDataSetService;
	
	@Autowired
	private StateInfoService stateInfoService;
	
	@RequestMapping("/IndiaDataSet")
	@GetMapping()
	public ResponseEntity<List<IndiaDataSet>> getAllIndiaData()
	{
	    return new ResponseEntity<>(indiaDataSetService.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping("/disasterDataSet")
	@GetMapping()
	public ResponseEntity<List<DisasterDataSet>> getAllDisasterData()
	{
		return new ResponseEntity<>(disasterDataSetService.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping("/unitedStatesDataSet")
	@GetMapping()
	public ResponseEntity<List<UnitedStatesDataSet>> getAllUnitedStatesData()
	{
		return new ResponseEntity<>(unitedStatesDataSetService.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping("/stateInfo")
	@GetMapping()
	public ResponseEntity<List<StateInfo>> getAllStateInfo()
	{
		return new ResponseEntity<>(stateInfoService.findAll(),HttpStatus.OK);
	}
}
