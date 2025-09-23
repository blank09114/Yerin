package com.parkyerin.yerin.mvc;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
public class YerinApi
{
    @Resource
    private YerinService service;

    // 게시글 등록
    @PostMapping("/submit")
    public Integer submitPost(@RequestBody PostDTO post)
    {
        service.writePost(post);
        return post.getPostId();
    }

    // 게시글 수정
    @PostMapping("/edit/{postId}/request")
    public Integer editPostRequest(@PathVariable Integer postId, @RequestBody PostDTO post)
    {
        post.setPostId(postId);
        service.modifyPost(post);
        return postId;
    }

    // 게시글 삭제
    @PostMapping("/delete/{postId}")
    public String deletePost(@PathVariable Integer postId)
    {
        service.removePost(postId);
        return "success";
    }
}
