package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.BusPass;

public interface BussPassService 
{
	BusPass addBusPass(BusPass b) ;
	List<BusPass> displayAllBusPass();
	String deleteBusPassById(Long id);

}
