package com.flab.studygroup.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserCreateRequestDto {
	private Long id;
	private String name;
	private String purpose;
	private String keyword;
	private String day;
	private String time;
	private int online;
	private int limit;
	private String startdate;
	private String intro;
}
