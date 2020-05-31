package com.covid9.dataset.service;

import java.util.List;

import com.covid9.dataset.model.DisasterDataSet;
import com.covid9.dataset.model.IndiaDataSet;

public interface DisasterDataSetService {
	List<DisasterDataSet> findAll();
}
