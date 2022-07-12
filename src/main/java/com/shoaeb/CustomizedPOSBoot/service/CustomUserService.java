package com.shoaeb.CustomizedPOSBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shoaeb.CustomizedPOSBoot.dao.UserDao;
import com.shoaeb.CustomizedPOSBoot.valueobject.TblUserMst;

@Service
public class CustomUserService implements UserDetailsService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		TblUserMst user = userDao.findByUsername(username);
		if(user == null)
			throw new UsernameNotFoundException("User not found");
		
		return new CustomUserDetails(user);
	}

}
