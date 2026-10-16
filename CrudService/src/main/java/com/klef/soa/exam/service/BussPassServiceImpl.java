package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.BusPass;
import com.klef.soa.exam.repository.BusPassRepository;

@Service
public class BussPassServiceImpl implements BussPassService{
	@Autowired
	private BusPassRepository busrepo;

	@Override
	public BusPass addBusPass(BusPass b) {
	
		return busrepo.save(b);
	}

	@Override
	public List<BusPass> displayAllBusPass() {
		return busrepo.findAll();
	}

	@Override
	public String deleteBusPassById(Long id) {
		boolean flag = busrepo.existsById(id);
		if(flag)
		{
			busrepo.deleteById(id);
			return "BusPass Deleted Successfully";
		}
		else
		{
			return "BusPass ID Not Found";
		}
	}

}
