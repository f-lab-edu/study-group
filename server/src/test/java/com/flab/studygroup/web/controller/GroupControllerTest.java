package com.flab.studygroup.web.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = GroupController.class)
public class GroupControllerTest {
	@Autowired
	private MockMvc mvc;

	@Test
	@DisplayName("모든 Group list들을 return한다")
	public void allListReturned() throws Exception {
		mvc.perform(get("/group/list")).andExpect(status().isOk());
	}
}
