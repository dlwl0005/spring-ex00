package org.zerock.persistence;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testConnection() {
		String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "c##mydbms";
		String password = "admin";
		try(Connection con = DriverManager.getConnection(url, user, password)){
			assertNotNull(con);
		}catch (Exception e) {
			fail(e.getMessage());
			log.info(e);
		}
	}

}
