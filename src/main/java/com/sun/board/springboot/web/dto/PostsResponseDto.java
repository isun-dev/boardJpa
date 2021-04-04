package com.sun.board.springboot.web.dto;

import com.sun.board.springboot.domain.posts.Posts;
import lombok.Getter;

// 게시글 삭제
@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
