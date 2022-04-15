package com.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class staffsDao {
	@Autowired
	staffsRepositor sr;
	public String bas ( staffsEntity q1) {
		sr. save(q1);
		return "save";
	}public String bal (staffsEntity q2) {
		sr.save (q2);
		return "save";
	}public String bos( int id) {
		sr.deleteById(id);
		return "delet";

	}public List<staffsEntity> getAll() {
		return sr.findAll();
	
		
		}

}


