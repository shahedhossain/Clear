package com.study.pack.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter @Setter 
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	
	private String name;
	
	private int age;
	
	private String sex;	
	
	

}
