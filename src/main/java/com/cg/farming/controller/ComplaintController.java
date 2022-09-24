package com.cg.farming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.farming.entity.Complaint;
import com.cg.farming.service.IComplaintService;

@RestController
public class ComplaintController {
	
	@Autowired
	IComplaintService compServ;
	
	@GetMapping("/advt/all")
	ResponseEntity<List<Complaint>> getAllComplaint() {
		List<Complaint> complaints= compServ.getAllComplaint();
		return new ResponseEntity<>(complaints, HttpStatus.OK); // 200 ok
	}
		
}
