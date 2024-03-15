package com.dodeuni.dodeuni.web.dto.comment;

import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommentUpdateRequestDto {
    @ApiModelProperty(notes = "댓글 아이디", dataType = "Long", example = "1")
    private Long commentId;

    @ApiModelProperty(notes = "커뮤니티 게시글 아이디", dataType = "Long", example = "1")
    private Long communityId;

    @ApiModelProperty(notes = "댓글 내용", dataType = "String", example = "내용")
    private String content;

    @Builder
    public CommentUpdateRequestDto(Long commentId, Long communityId, String content) {
        this.commentId = commentId;
        this.communityId = communityId;
        this.content = content;
    }
}
