package com.flab.studygroup.domain.group;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GroupRepository extends JpaRepository<Group, Long> {
	@Query("SELECT p FROM Group p ORDER BY p.id ASC")
	List<Group> findAll();
}
