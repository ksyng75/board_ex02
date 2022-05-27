package com.jafa.dao;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.jafa.config.RootConfig;
import com.jafa.config.ServletConfig;
import com.jafa.dto.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class, ServletConfig.class})
@WebAppConfiguration
public class BoardMapperTest {
	
	@Autowired
	BoardMapper mapper;
	
	@Autowired
	DataSource dataSource;
	
	@After
	public void setUp() throws IOException, SQLException {
		Reader reader = Resources.getResourceAsReader("sql/sql02.sql");
		ScriptRunner runner = new ScriptRunner(dataSource.getConnection());
		runner.runScript(reader);
	}
	
	@Test
	public void getListTest() {
		List<Board> list = mapper.getList();
		assertEquals(4, list.size());
	}
	@Test
	public void insertTest() {
		Board board = new Board();
		board.setTitle("test_title");
		board.setContent("test_contents");
		board.setWriter("test_writer");
		mapper.insert(board);
		
		System.out.println("가장 최신글 번호 : " + board.getBno());
		
		List<Board> list = mapper.getList();
		assertEquals(5, list.size());
	}
	public void findByBno() {
		Board findByBno =  mapper.findByBno(1L);
		assertEquals("게시물 제목1", findByBno.getTitle());
		assertEquals("거시기1", findByBno.getWriter());
		assertEquals("배가 고픔니다", findByBno.getContent());
	}

}
