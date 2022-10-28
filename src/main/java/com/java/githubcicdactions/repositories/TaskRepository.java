package com.java.githubcicdactions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.githubcicdactions.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    
}
