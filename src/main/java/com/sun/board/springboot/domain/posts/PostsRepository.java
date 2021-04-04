package com.sun.board.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    @Query("select p from posts p order by p.id desc")
    List<Posts> findAllDesc();
}
