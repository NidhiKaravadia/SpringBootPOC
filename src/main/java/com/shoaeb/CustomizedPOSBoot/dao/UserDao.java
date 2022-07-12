package com.shoaeb.CustomizedPOSBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoaeb.CustomizedPOSBoot.valueobject.TblUserMst;

@Repository
public interface UserDao extends JpaRepository<TblUserMst,Long>{

	
	TblUserMst findByUsername(String username);
}
