package com.sagardevlab.webgenai.dto.Member;

import com.sagardevlab.webgenai.enums.ProjectRole;

public record InviteMemberRequest(
    String email,
    ProjectRole role
) {
    
}
