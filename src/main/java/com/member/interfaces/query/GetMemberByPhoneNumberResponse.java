package com.member.interfaces.query;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetMemberByPhoneNumberResponse {
    private String userImage; // user 프로필 사진
    private String name; // 이름
    private String phoneNumber; // 전화번호이자 아이디
    private int id; // user의 pk
}
