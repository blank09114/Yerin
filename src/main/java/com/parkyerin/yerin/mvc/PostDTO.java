package com.parkyerin.yerin.mvc;

import lombok.Data;

@Data
public class PostDTO
{
    private Integer postId;
    private String postTitle;
    private String postSubTitle;
    private String postGit;
    private String postThumbnail;
    private String postTag;
    private String postContent;
}