package com.flab.studygroup.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class GroupCreateRequestDto {
	private final Long id;
	private final String name;
	private final String password;
	private final String tel;
}
