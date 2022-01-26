package com.flab.studygroup.mapper;

import java.util.Optional;

import org.mapstruct.Mapper;

import com.flab.studygroup.domain.group.Group;
import com.flab.studygroup.web.dto.GroupCreateRequestDto;

@Mapper(componentModel = "spring")
public interface GroupMapper extends GenericMapper<GroupCreateRequestDto, Group> {
	Optional<Group> findById(long id);
}
