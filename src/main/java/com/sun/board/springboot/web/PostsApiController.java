package com.sun.board.springboot.web;

import com.sun.board.springboot.service.PostsService;
import com.sun.board.springboot.web.dto.PostsResponseDto;
import com.sun.board.springboot.web.dto.PostsSaveRequestDto;
import com.sun.board.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    // @RequestBody 어노테이션을 이용하면 HTTP 요청 몸체를 자바 객체로 전달받을 수 있다.
    // 게시글 등록
    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

    // 게시글 수정 - PathVariable은 주로 REST에서 사용, URL경로의 일부를 파라미터로 씀.
    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }

    // 게시글 삭제
    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }
}
