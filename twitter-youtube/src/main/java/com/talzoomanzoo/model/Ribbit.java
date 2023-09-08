package com.talzoomanzoo.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="ribbit")
public class Ribbit {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private User user;
	
	private String content;
	
	@ManyToOne
	private Ribbit replyFor;
	private String image;
	private String video;
	
	@OneToMany(mappedBy="ribbit", cascade=CascadeType.ALL)
	private List<Like> likes = new ArrayList<>();
	
	@OneToMany
	private List<Ribbit> replyRibbit = new ArrayList<>();
	
	@ManyToMany
	private List<User> rebbitUser = new ArrayList<>();
	
	private boolean isReply;
	private boolean isRibbit;
	private LocalDateTime createdAt;
}
