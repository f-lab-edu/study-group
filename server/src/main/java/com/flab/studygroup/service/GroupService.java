package com.flab.studygroup.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flab.studygroup.domain.group.GroupRepository;
import com.flab.studygroup.web.dto.GroupListReponseDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class GroupService {
	private final GroupRepository groupRepository;

	@Transactional(readOnly = true)
	public List<GroupListReponseDto> findAll() {
		return groupRepository.findAll().stream()
			.map(GroupListReponseDto::new)
			.collect(Collectors.toList());
	}
}
