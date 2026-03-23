package com.sagardevlab.webgenai.service;

import java.util.List;
import com.sagardevlab.webgenai.dto.Member.InviteMemberRequest;
import com.sagardevlab.webgenai.dto.Member.MemberResponse;
import com.sagardevlab.webgenai.dto.Member.UpdateMemberRoleRequest;

public interface ProjectMemberService {

    List<MemberResponse> getProjectMembers(Long projectId, Long userId);
    
    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}