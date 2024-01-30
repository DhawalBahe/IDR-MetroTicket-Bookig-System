package com.idr.metro.serviceimppl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idr.metro.entity.Schedule;
import com.idr.metro.repository.SchedularRepository;
import com.idr.metro.service.SchedularService;

public class SchedularServiceImpl implements SchedularService {

	@Autowired
	SchedularRepository schedularRepository;
	
	@Override
	public List<Schedule> getlist() {
		return schedularRepository.findAll();
	}

}
