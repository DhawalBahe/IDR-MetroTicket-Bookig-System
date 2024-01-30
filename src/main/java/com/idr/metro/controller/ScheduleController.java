package com.idr.metro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.idr.metro.entity.Schedule;
import com.idr.metro.service.SchedularService;

@RestController
public class ScheduleController {

	@Autowired
	SchedularService schedularService;

	@GetMapping("/getschedule")
	public List<Schedule> getlist() {
		return schedularService.getlist();

	}
}
