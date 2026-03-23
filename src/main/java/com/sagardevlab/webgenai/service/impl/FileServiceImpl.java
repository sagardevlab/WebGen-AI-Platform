package com.sagardevlab.webgenai.service.impl;

import org.springframework.stereotype.Service;
import com.sagardevlab.webgenai.service.FileService;

import java.util.List;
import com.sagardevlab.webgenai.dto.project.FileNode;
import com.sagardevlab.webgenai.dto.project.FileContentResponse;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public List<FileNode> getFileTree(Long projectId, Long userId) {
        return List.of();
    }
    
    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        return null;
    }
}
