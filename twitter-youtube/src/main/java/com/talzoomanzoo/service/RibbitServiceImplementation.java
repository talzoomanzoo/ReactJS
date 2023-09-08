package com.talzoomanzoo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talzoomanzoo.exception.RibbitException;
import com.talzoomanzoo.exception.UserException;
import com.talzoomanzoo.model.Ribbit;
import com.talzoomanzoo.model.User;
import com.talzoomanzoo.repository.RibbitRepository;
import com.talzoomanzoo.request.RibbitReplyRequest;

@Service
public class RibbitServiceImplementation implements RibbitService{

	@Autowired
	private RibbitRepository ribbitRepository;
	
	@Override
	public Ribbit createRibbit(Ribbit req, User user) throws UserException {
		// TODO Auto-generated method stub
		
		Ribbit ribbit=new Ribbit();
		ribbit.setContent(req.getContent());
		ribbit.setCreatedAt(LocalDateTime.now());
		ribbit.setImage(req.getImage());
		ribbit.setUser(user);
		ribbit.setReply(false);
		ribbit.setRibbit(true);
		ribbit.setVideo(req.getVideo());
		
		return ribbitRepository.save(ribbit);
	}

	@Override
	public List<Ribbit> findAllRibbit() {
	
		return ribbitRepository.findAllByIsRibbitTrueOrderByCreatedAtDesc();
	}

	@Override
	public Ribbit rebbit(Long ribbitId, User user) throws UserException, RibbitException {
		Ribbit ribbit=findById(ribbitId);
		if(ribbit.getRebbitUser().contains(user)) {
			ribbit.getRebbitUser().remove(user);
		}
		else {
			ribbit.getRebbitUser().add(user);
		}
		return ribbitRepository.save(ribbit);
	}

	@Override
	public Ribbit findById(Long ribbitId) throws RibbitException {
		// TODO Auto-generated method stub
		Ribbit ribbit=ribbitRepository.findById(ribbitId)
				.orElseThrow(()-> new RibbitException("Ribbit not found with id" + ribbitId));
				
		return ribbit;
	}

	@Override
	public void deleteRibbitById(Long ribbitId, Long userId) throws RibbitException, UserException {
		// TODO Auto-generated method stub
		Ribbit ribbit=findById(ribbitId);
		
		if(!userId.equals(ribbit.getUser().getId())) {
			throw new UserException("you can't delete another user's ribbit");
		}
		
		ribbitRepository.deleteById(ribbit.getId());
	}

	@Override
	public Ribbit removeFromRebbit(Long ribbitId, User user) throws RibbitException, UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ribbit createdReply(RibbitReplyRequest req, User user) throws RibbitException {
		
		Ribbit replyFor=findById(req.getRibbitId());
				
		Ribbit ribbit=new Ribbit();
		ribbit.setContent(req.getContent());
		ribbit.setCreatedAt(LocalDateTime.now());
		ribbit.setImage(req.getImage());
		ribbit.setUser(user);
		ribbit.setReply(true);
		ribbit.setRibbit(false);
		ribbit.setReplyFor(replyFor);
		
		Ribbit savedReply=ribbitRepository.save(ribbit);
		
		ribbit.getReplyRibbit().add(savedReply);
		ribbitRepository.save(replyFor);
		
		return replyFor;
	}

	@Override
	public List<Ribbit> getUserRibbit(User user) {
		// TODO Auto-generated method stub
		return ribbitRepository.findByRebbitUserContainsOrUserIdAndIsRibbitTrueOrderByCreatedAtDesc(user,user.getId());
	}

	@Override
	public List<Ribbit> findByLikesContainsUser(User user) {
		// TODO Auto-generated method stub
		return ribbitRepository.findByLikesUser_id(user.getId());
		
	}

}
