package com.sagardevlab.webgenai.service;

import java.util.List;
import com.sagardevlab.webgenai.dto.project.FileNode;
import com.sagardevlab.webgenai.dto.project.FileContentResponse;

public interface FileService {
    
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
