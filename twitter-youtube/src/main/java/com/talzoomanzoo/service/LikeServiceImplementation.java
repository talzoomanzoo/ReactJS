package com.talzoomanzoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talzoomanzoo.exception.RibbitException;
import com.talzoomanzoo.exception.UserException;
import com.talzoomanzoo.model.Like;
import com.talzoomanzoo.model.Ribbit;
import com.talzoomanzoo.model.User;
import com.talzoomanzoo.repository.LikeRepository;
import com.talzoomanzoo.repository.RibbitRepository;

@Service
public class LikeServiceImplementation implements LikeService{
	
	@Autowired
	private LikeRepository likeRepository;
	@Autowired
	private RibbitService ribbitService;
	@Autowired
	private RibbitRepository ribbitRepository;
	
	@Override
	public Like likeRibbit(Long ribbitId, User user) throws UserException, RibbitException {
		// TODO Auto-generated method stub
		Like isLikeExist=likeRepository.isLikeExist(user.getId(), ribbitId);
		
		if(isLikeExist!=null) {
			likeRepository.deleteById(isLikeExist.getId());
			return isLikeExist;
		}
		
		Ribbit ribbit=ribbitService.findById(ribbitId);
		
		Like like = new Like();
		like.setRibbit(ribbit);
		like.setUser(user);
		
		Like savedLike=likeRepository.save(like);
		
		ribbit.getLikes().add(savedLike);
		ribbitRepository.save(ribbit);
		
		return savedLike;
	}

	@Override
	public List<Like> getAllLikes(Long ribbitId) throws RibbitException {
		// TODO Auto-generated method stub
		
		Ribbit ribbit = ribbitService.findById(ribbitId);
		
		List<Like> likes=likeRepository.findByRibbitId(ribbitId);
		return likes;
	}

}
