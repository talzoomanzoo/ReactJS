package com.talzoomanzoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talzoomanzoo.service.RibbitService;
import com.talzoomanzoo.service.UserService;

@RestController
@RequestMapping("/api/ribbit")
public class RibbitController {

	@Autowired
	private RibbitService ribbitService;
	
	@Autowired
	private UserService userService;
	
	
}
