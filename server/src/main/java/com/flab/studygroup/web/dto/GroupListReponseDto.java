package com.flab.studygroup.web.dto;

import com.flab.studygroup.domain.group.Group;
import com.flab.studygroup.mapper.GroupMapper;

import lombok.Getter;

@Getter
public class GroupListReponseDto {
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

	public GroupListReponseDto(Group entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.purpose = entity.getPurpose();
		this.keyword = entity.getKeyword();
		this.day = entity.getDay();
		this.time = entity.getTime();
		this.online = entity.getOnline();
		this.limit = entity.getLimit();
		this.startdate = entity.getStartdate();
		this.intro = entity.getIntro();
	}
}
