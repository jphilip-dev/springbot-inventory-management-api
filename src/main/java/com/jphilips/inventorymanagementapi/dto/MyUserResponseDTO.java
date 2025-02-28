package com.jphilips.inventorymanagementapi.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MyUserResponseDTO {
	private Long id;

	private String username;

	private String firstName;

	private String lastName;
	
	private Boolean isActive;
}
