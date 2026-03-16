package com.sagardevlab.webgenai.service;

import java.util.List;
import com.sagardevlab.webgenai.dto.project.ProjectSummaryResponse;
import com.sagardevlab.webgenai.dto.project.ProjectResponse;
import com.sagardevlab.webgenai.dto.project.ProjectRequest;

public interface ProjectService {
    
    List<ProjectSummaryResponse> getMyProjects(Long userId);

    ProjectResponse getUserProjectById(Long userId, Long projectId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long projectId, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}
