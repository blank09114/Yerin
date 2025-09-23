package com.parkyerin.yerin.mvc;

import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YerinService
{
    @Resource
    private YerinMapper mapper;

    // 목록 조회
    public List<PostDTO> getPostsByTag(String tag) { return mapper.selectPostsByTag(tag.toLowerCase()); }

    // 상세 보기
    public PostDTO getPostById(Integer postId) { return mapper.selectPostById(postId); }

    // 작성
    public void writePost(PostDTO post) { mapper.insertPost(post); }

    // 수정
    public void modifyPost(PostDTO post) { mapper.updatePost(post); }

    // 삭제
    public void removePost(Integer postId) { mapper.deletePost(postId); }
}