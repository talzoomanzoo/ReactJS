package com.talzoomanzoo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.talzoomanzoo.model.Like;

public interface LikeRepository extends JpaRepository<Like, Long>{

	@Query("SELECT I FROM Like I WHERE I.user.id=:userId AND I.ribbit.id=:ribbitId")
	public Like isLikeExist(@Param("userId") Long userId, @Param("ribbitId") Long ribbitId);
	
	@Query("SELECT I FROM Like I WHERE I.ribbit.id=:ribbitId")
	public List<Like> findByRibbitId(@Param("ribbitId") Long ribbitId);
		
}
