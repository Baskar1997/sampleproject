package com.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class staffsService {
	@Autowired
	staffsDao sd;
	public String bas ( staffsEntity q1) {
		return sd.bas(q1);
	}public String bal (staffsEntity q2) {
		return sd.bal(q2);
	}public String bos( int id) {
		return sd.bos(id);
	}public List<staffsEntity> getAll() {
		return sd.getAll();
}
}