package com.sagardevlab.webgenai.service;

import java.util.List;
import com.sagardevlab.webgenai.entity.ProjectMember;
import com.sagardevlab.webgenai.dto.Member.InviteMemberRequest;
import com.sagardevlab.webgenai.dto.Member.MemberResponse;

public interface ProjectMemberService {

    List<ProjectMember> getProjectMembers(Long projectId, Long userId);
    
    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);
}
