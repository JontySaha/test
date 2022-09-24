package com.cg.farming.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Complaint {
	@Id
	@GeneratedValue
	private int id;
	private String complaint;
	private boolean status=false;
}
