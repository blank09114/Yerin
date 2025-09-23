package com.parkyerin.yerin.mvc;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface YerinMapper
{
    // 목록 조회
    List<PostDTO> selectPostsByTag(String tag);

    // 상세 보기
    PostDTO selectPostById(Integer postId);

    // 작성
    void insertPost(PostDTO post);

    // 수정
    void updatePost(PostDTO post);

    // 삭제
    void deletePost(Integer postId);
}