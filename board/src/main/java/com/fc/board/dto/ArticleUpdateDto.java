package com.fc.board.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.fc.board.domain.Article}
 */
public record ArticleUpdateDto(String title,
                               String content,
                               String hashtag) {
    public static ArticleUpdateDto of (String title, String content, String hashtag) {
        return new ArticleUpdateDto(title,content,hashtag);
    }
}