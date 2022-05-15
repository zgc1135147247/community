package com.nowcoder.community.service;

import com.nowcoder.community.entity.DiscussPost;

import java.util.List;

public interface IDiscussPostService{

    List<DiscussPost> findDiscussPost(int userId, int offset, int limit);

    int findDiscussPostRows(int userId);
}
