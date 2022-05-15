package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    /**
     * 查询社区
     * @param userId 用户名
     * @param offset 每一页的起始行号
     * @param limit 每一页的限制行数
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    /**
     * 查询有多少页
     * 如果需要动态的拼接某个条件，在<if>里使用，并且这个方法有且只有一个条件，则必须取别名，用@param
     * @param userId 用户id
     * @return
     */
    int selectDiscussPostRows(@Param("userId") int userId);

}
