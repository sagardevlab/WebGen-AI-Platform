package com.sagardevlab.webgenai.mapper;

import org.mapstruct.Mapper;
import com.sagardevlab.webgenai.dto.project.ProjectResponse;
import com.sagardevlab.webgenai.entity.Project;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
    
    ProjectResponse toProjectResponse(Project project);

}
