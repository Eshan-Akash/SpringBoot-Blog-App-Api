package com.codewitheshan.blog.services;

import com.codewitheshan.blog.payloads.CommentDto;

public interface CommentService {
	CommentDto createComment(CommentDto CommentDto, Integer postId);
	
	void deleteComment(Integer commentId);
}
