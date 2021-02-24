package com.society.neelamber.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.society.neelamber.bean.Resident;

@Repository
public interface GenericDao extends JpaRepository<Resident, Integer>{
	
	public Optional<Resident> getResidentByFlatNoIgnoreCase(String flatNo);

}
