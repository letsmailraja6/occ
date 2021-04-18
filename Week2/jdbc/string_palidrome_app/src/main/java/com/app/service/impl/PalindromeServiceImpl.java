package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Data;
import com.app.repository.PalindromeDataRepository;
import com.app.service.PalindromeService;

@Service
public class PalindromeServiceImpl implements PalindromeService {
	
	@Autowired
	private PalindromeDataRepository repository;

	@Override
	public Data findLargestPalindromeAndPersist(Data data) {
		String temp=data.getLongestPalindrome();
		int max=0;
		
		for (int i = 0; i < temp.length(); i++) {
			for(int j=i+1;j<temp.length();j++) {
				String x=temp.substring(i, j);
				if(new StringBuilder(x).reverse().toString().equals(x)) {
					if(x.length()>max) {
						max=x.length();
						data.setLongestPalindrome(x);
					}
				}
			}
		}
		return repository.save(data);
	}

}
