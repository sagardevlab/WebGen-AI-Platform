package com.sagardevlab.webgenai.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sagardevlab.webgenai.dto.project.ProjectResponse;
import com.sagardevlab.webgenai.dto.project.ProjectSummaryResponse;
import com.sagardevlab.webgenai.repository.ProjectRepository;
import com.sagardevlab.webgenai.repository.UserRepository;
import com.sagardevlab.webgenai.service.ProjectService;

import jakarta.transaction.Transactional;

import com.sagardevlab.webgenai.mapper.ProjectMapper;

import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import com.sagardevlab.webgenai.entity.Project;
import com.sagardevlab.webgenai.entity.User;

import com.sagardevlab.webgenai.dto.project.ProjectRequest;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
@Transactional
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        User owner = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));

        Project project = Project.builder()
                .name(request.name())
                .owner(owner)
                .isPublic(false)
                .build();
        
        project = projectRepository.save(project);

        return projectMapper.toProjectResponse(project);
    }

    @Override
    public List<ProjectSummaryResponse> getMyProjects(Long userId) {
        return List.of();
    }

    @Override
    public ProjectResponse getUserProjectById(Long userId, Long projectId) {
        return null;
    }

    @Override
    public ProjectResponse updateProject(Long projectId, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
