package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CommunityApplicationTests {

	@Autowired
	private DiscussPostMapper discussPostMapper;
	@Autowired
	private UserMapper userMapper;

	@Test
	void contextLoads() {
	}

	@Test
	public void testSelect() {
		List<DiscussPost> list = discussPostMapper.selectDiscussPosts(149, 0, 10);
		//System.out.println(list.size());
		for(DiscussPost post: list){
			System.out.println(post);
		}

		int count = discussPostMapper.selectDiscussPostRows(149);
		System.out.println(count);
	}

	@Test
	public void testSelectUser() {
		User user = userMapper.selectById(1);
		System.out.println(user);

	}
}
