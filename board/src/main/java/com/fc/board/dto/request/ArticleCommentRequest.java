package com.fc.board.dto.request;

import com.fc.board.dto.ArticleCommentDto;
import com.fc.board.dto.UserAccountDto;

/**
 * DTO for {@link com.fc.board.domain.ArticleComment}
 */
public record ArticleCommentRequest(Long articleId, String content) {
    public static ArticleCommentRequest of(Long articleId, String content) {
        return new ArticleCommentRequest(articleId, content);
    }

    public ArticleCommentDto toDto(UserAccountDto userAccountDto) {
        return ArticleCommentDto.of(
                articleId,
                userAccountDto,
                content
        );
    }
}