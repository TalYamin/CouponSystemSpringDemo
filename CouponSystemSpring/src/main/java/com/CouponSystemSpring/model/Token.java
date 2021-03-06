package com.CouponSystemSpring.model;

import org.springframework.stereotype.Component;

import com.CouponSystemSpring.service.ClientType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Token {
	
	private String token;
	private String clientType;

}
