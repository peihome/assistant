package com.fnatics.assistant.tables.repo;

import com.fnatics.assistant.tables.Assignment;
import com.fnatics.assistant.tables.Takes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface AssignmentRepo extends JpaRepository<Assignment, Integer> {
}
