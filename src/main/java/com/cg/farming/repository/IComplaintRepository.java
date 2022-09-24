package com.cg.farming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.farming.entity.Complaint;

public interface IComplaintRepository extends JpaRepository<Complaint,Integer>{

}
