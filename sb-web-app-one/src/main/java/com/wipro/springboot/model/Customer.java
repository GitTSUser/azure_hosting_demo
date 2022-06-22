package com.wipro.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
	
	@Id
	private Integer id;
	private String name;
	private String emailId;

}
