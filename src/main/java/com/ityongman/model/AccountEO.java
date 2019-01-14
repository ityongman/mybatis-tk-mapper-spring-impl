package com.ityongman.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="account")
public class AccountEO implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private Long id ;
	
	private String name ;
	
	private BigDecimal balance ;
	
	private BigDecimal frezee ;
}
