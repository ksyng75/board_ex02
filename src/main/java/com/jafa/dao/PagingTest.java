package com.jafa.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jafa.config.RootConfig;
import com.jafa.dto.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class}) //설정파일
public class PagingTest {

	@Autowired
	BoardMapper mapper;
	
	@Test
	public void insertTest() {
		
		for(int i=1; i <= 412 ; i++) {
		Board board = new Board();
		board.setTitle("제목 : test" +i);
		board.setContent("내용 : test"+i);
		board.setWriter("test"+i);
		mapper.insert(board);
		}
	}
}
