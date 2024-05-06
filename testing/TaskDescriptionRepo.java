package com.uniplan.repo;

import com.uniplan.model.TaskDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDescriptionRepo extends JpaRepository<TaskDescription, Long> {
}
