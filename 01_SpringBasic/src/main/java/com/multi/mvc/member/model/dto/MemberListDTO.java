package com.multi.mvc.member.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// 배열 파라미터 처리용 dto
// -> 기존 dto와 다르게 List를 가지고 있어야 한다
@Data //getter,setter,toString 자동 생성
@AllArgsConstructor // 모든 필드를 포함한 생성자
@NoArgsConstructor //매개 변수 없는 생성자

public class MemberListDTO {

    private List<MemberDTO> list; // 파라미터 배열을 처리하기 위한 list 변수
}
