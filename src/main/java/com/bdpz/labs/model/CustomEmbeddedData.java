package com.bdpz.labs.model;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import javax.persistence.Embeddable;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class CustomEmbeddedData {

	private LocalDateTime creationTimestamp;
	private LocalDateTime updateTimestamp;

	@PrePersist
	public void prePersistCustomData() {
		creationTimestamp = LocalDateTime.now(ZoneOffset.UTC);
	}

	@PreUpdate
	public void preUpdateCustomData() {
		updateTimestamp = LocalDateTime.now(ZoneOffset.UTC);
	}

}
