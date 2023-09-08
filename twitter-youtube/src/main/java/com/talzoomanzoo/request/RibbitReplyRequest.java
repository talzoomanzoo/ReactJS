package com.talzoomanzoo.request;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class RibbitReplyRequest {

	private String content;
	private Long ribbitId;
	private LocalDateTime createdAt;
	private String image;
	
}
