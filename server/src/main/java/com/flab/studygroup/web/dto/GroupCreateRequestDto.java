package com.flab.studygroup.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GroupCreateRequestDto {
	private Long id;
	private String name;
	private String password;
	private String tel;
}
