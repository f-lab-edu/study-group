package com.flab.studygroup.web.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flab.studygroup.web.dto.GroupCreateRequestDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/group")
public class GroupController {

	@PostMapping("/creation")
	public void create(@RequestBody GroupCreateRequestDto createDto) {

	}

	@GetMapping("/{id}")
	public void findById() {

	}

	@GetMapping("/list")
	public void findAll() {
		
	}

	@PutMapping("/{id}")
	public void update() {

	}

	@DeleteMapping("/{id}")
	public void delete () {

	}
}
