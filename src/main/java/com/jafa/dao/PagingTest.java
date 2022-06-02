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
		
		for(int i=1; i <=412 ; i++) {
		Board board = new Board();
		board.setTitle("test_title" +i);
		board.setContent("test_contents"+i);
		board.setWriter("test_writer"+i);
		mapper.insert(board);
		}
	}
}
