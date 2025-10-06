package kr.co.sinamu.gallery.account.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class AccountJoinRequest {

    private String name;
    private String loginId;
    private String loginPw;
}

