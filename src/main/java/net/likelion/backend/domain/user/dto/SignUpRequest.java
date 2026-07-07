package net.likelion.backend.domain.user.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor //기본 생성자 필요해서
public class SignUpRequest {
    private String username;
    private String password;
}
