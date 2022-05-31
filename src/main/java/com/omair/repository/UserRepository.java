package com.omair.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.omair.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query(value = "SELECT * FROM USER WHERE email = ?1", nativeQuery = true)
	public List<User> findByEmailAddress(String email);
	
	@Query(value = "SELECT * FROM USER WHERE l_name = ?1", nativeQuery = true)
	public List<User>findBylName(String name);
	
	@Query(value = "SELECT * FROM USER WHERE email like %?1% or h_phone like %?2% or o_phone like %?3% or p_phone like %?4% or l_name like %?5%", 
			nativeQuery = true)
	public List<User>findBySearch(@Param("email") String email,
									@Param("hPhone") String hPhone,
									@Param("oPhone") String oPhone,
									@Param("pPhone") String pPhone,
									@Param("lName") String lName);
}
