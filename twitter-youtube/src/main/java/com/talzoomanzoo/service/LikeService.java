package com.talzoomanzoo.service;

import java.util.List;

import com.talzoomanzoo.exception.RibbitException;
import com.talzoomanzoo.exception.UserException;
import com.talzoomanzoo.model.Like;
import com.talzoomanzoo.model.User;

public interface LikeService {
	
	public Like likeRibbit(Long ribbitId, User user) throws UserException, RibbitException;
	
	public List<Like>getAllLikes(Long ribbitId) throws RibbitException;
	
	
}
