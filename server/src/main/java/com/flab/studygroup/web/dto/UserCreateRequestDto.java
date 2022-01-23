package com.flab.studygroup.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserCreateRequestDto {
	private final Long id;
	private final String name;
	private final String password;
	private final String tel;
}