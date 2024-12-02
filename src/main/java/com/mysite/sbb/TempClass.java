package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class TempClass {
	private String hello;
	private int lombok;

	public static void main(String[] args) {
		TempClass tmp = new TempClass();
		tmp.getHello(); 
	}
}