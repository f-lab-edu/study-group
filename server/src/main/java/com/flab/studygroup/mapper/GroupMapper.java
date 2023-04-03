package com.flab.studygroup.mapper;

import org.mapstruct.Mapper;

import com.flab.studygroup.domain.group.Group;
import com.flab.studygroup.web.dto.GroupListReponseDto;

@Mapper(componentModel = "spring")
public interface GroupMapper extends GenericMapper<GroupListReponseDto, Group> {
}
