package com.sagardevlab.webgenai.service.impl;

import org.springframework.stereotype.Service;

import com.sagardevlab.webgenai.service.ProjectMemberService;
import java.util.List;
import com.sagardevlab.webgenai.dto.Member.InviteMemberRequest;
import com.sagardevlab.webgenai.dto.Member.MemberResponse;
import com.sagardevlab.webgenai.dto.Member.UpdateMemberRoleRequest;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService  {
    
    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        return null;
    }

     @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId) {
        return null;
    }

     @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId) {
        return null;
    }
    
}
