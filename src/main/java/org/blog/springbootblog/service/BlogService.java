package org.blog.springbootblog.service;

import lombok.RequiredArgsConstructor;
import org.blog.springbootblog.domain.Article;
import org.blog.springbootblog.dto.AddArticleRequest;
import org.blog.springbootblog.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
