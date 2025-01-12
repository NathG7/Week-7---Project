package project;

import java.sql.Connection;

import project.dao.DBConnection;

public class Project {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Connection conn = DBConnection.getConnection();
	}

}
