package com.sagardevlab.webgenai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sagardevlab.webgenai.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    
}
