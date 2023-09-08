package com.talzoomanzoo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="verification")
public class Verification {

	private boolean status=false;
	private LocalDateTime startedAt;
	private LocalDateTime endsAt;
	private String planType;
}
