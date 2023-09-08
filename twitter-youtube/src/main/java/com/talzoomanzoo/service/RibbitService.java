package com.talzoomanzoo.service;

import java.util.List;

import com.talzoomanzoo.exception.RibbitException;
import com.talzoomanzoo.exception.UserException;
import com.talzoomanzoo.model.Ribbit;
import com.talzoomanzoo.model.User;
import com.talzoomanzoo.request.RibbitReplyRequest;

public interface RibbitService {

	public Ribbit createRibbit(Ribbit req, User user) throws UserException;
	public List<Ribbit> findAllRibbit();
	public Ribbit rebbit(Long ribbitId, User user) throws UserException, RibbitException;
	public Ribbit findById(Long ribbitId) throws RibbitException;
	
	public void deleteRibbitById(Long ribbitId, Long userId) throws RibbitException, UserException;
	
	public Ribbit removeFromRebbit(Long ribbitId, User user) throws RibbitException, UserException;
	
	public Ribbit createdReply(RibbitReplyRequest req, User user) throws RibbitException;
	
	public List<Ribbit> getUserRibbit(User user);
	
	public List<Ribbit> findByLikesContainsUser(User user);
	
}
