package com.multi.mybatis.board.model.vo;

import com.multi.mybatis.common.PageInfo;

//BoardParamDTO, BoardForm, BoardParam
//게시판 검색시 사용하는 변수를 정리한 객체 (HTML-Form 에 있는 인자들)
public class BoardForm {
    private String title; // 제목
    private String content; // 내용
    private String writer; // 글쓴사람
    private PageInfo pageInfo;

}
