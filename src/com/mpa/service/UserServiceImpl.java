package com.mpa.service;

import java.util.ArrayList;

import com.mpa.domain.User;

public class UserServiceImpl implements UserService {
	
	int n;
	public int add(User user) {
		ArrayList<String> al = new ArrayList<String>();
        al.add(user.getName());
        for(int i=0; i<3; i++){
        	al.add("testuser"+i);
        }
        System.out.println(al);
        n = al.size();
        System.out.println("Total number of registered users : "+al.size());
       
        return n; 
	}

}
