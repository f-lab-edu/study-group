package com.flab.studygroup.web.dto;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserCreateRequestDto {
	@Test
	@DisplayName("Lombok Test")
	public void lombokTest() throws Exception {
		Long id = 0L;
		String name = "jane doe";
		String password = "qwerty1!";
		String tel = "010-0000-0000";

		GroupCreateRequestDto dto = new GroupCreateRequestDto(id, name, password, tel);

		assertThat(dto.getId()).isEqualTo(id);
		assertThat(dto.getName()).isEqualTo(name);
		assertThat(dto.getPassword()).isEqualTo(password);
		assertThat(dto.getTel()).isEqualTo(tel);
	}
}
