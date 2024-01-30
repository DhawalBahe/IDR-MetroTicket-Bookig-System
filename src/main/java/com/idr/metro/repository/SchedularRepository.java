package com.idr.metro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idr.metro.entity.Schedule;

public interface SchedularRepository extends JpaRepository<Schedule, Long> {

}
