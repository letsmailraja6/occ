package com.demo.service.impl;

import com.demo.service.Service;

public class ServiceImpl implements Service {

	@Override
	public boolean isValidPrimeNumber(int n) {
		boolean b=false;
		int c=0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			b=true;
		}
		return b;
		
	}

	@Override
	public boolean isValidMobileNumber(String s) {
		if(s!=null && s.matches("\\+1-[0-9]{10}")) {
			return true;
		}
		return false;
	}

}
