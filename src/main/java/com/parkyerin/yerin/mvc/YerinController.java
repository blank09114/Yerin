package com.parkyerin.yerin.mvc;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class YerinController
{
    @Resource
    private YerinService service;

    // 메인 페이지
    @GetMapping("/")
    public String main() { return "main"; }

    // 로그인 페이지
    @GetMapping("/login")
    public String login() { return "login"; }

    // 게시판 페이지
    @GetMapping("/board/{type:(?i)web|game|ect}")
    public String board(@PathVariable String type, Model model)
    {
        model.addAttribute("boardType", type.toUpperCase()); // 게시판명
        model.addAttribute("posts", service.getPostsByTag(type)); // 목록
        return "board";
    }

    // 게시글 페이지
    @GetMapping("/post/{postId}")
    public String post(@PathVariable Integer postId, Model model)
    {
        model.addAttribute("post", service.getPostById(postId));
        return "post";
    }

    // 게시글 작성 페이지
    @GetMapping("/write")
    public String writePost(Model model)
    {
        model.addAttribute("post", new PostDTO());
        model.addAttribute("mode", "write");
        return "postForm";
    }

    // 게시글 수정 페이지
    @GetMapping("/edit/{postId}")
    public String editPost(@PathVariable Integer postId, Model model)
    {
        PostDTO post = service.getPostById(postId);
        model.addAttribute("post", post);
        model.addAttribute("mode", "edit");
        return "postForm";
    }
}