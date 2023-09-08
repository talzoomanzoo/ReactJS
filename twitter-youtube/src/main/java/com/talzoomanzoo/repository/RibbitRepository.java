package com.talzoomanzoo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.talzoomanzoo.model.Ribbit;
import com.talzoomanzoo.model.User;

public interface RibbitRepository extends JpaRepository<Ribbit, Long>{
	
	List<Ribbit>findAllByIsRibbitTrueOrderByCreatedAtDesc();
	
	
	List<Ribbit>findByRebbitUserContainsOrUserIdAndIsRibbitTrueOrderByCreatedAtDesc(User user, Long userId);
	
	List<Ribbit>findByLikesContainingOrderByCreatedAtDesc(User user);
	
	@Query("Select t From Ribbit t JOIN t.likes I WHERE I.user.id=:userId")
	List<Ribbit>findByLikesUser_id(Long userId);
	
}
