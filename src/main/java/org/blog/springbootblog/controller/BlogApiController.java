package org.blog.springbootblog.controller;

import lombok.RequiredArgsConstructor;
import org.blog.springbootblog.domain.Article;
import org.blog.springbootblog.dto.AddArticleRequest;
import org.blog.springbootblog.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BlogApiController {

    private final BlogService blogService;

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest reqeust){
        Article savedArticle = blogService.save(reqeust);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedArticle);
    }
}
