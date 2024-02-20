package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.bean.UserBean;
import com.jsp.util.DBUtil;

public class UserDAO {

	private static final String INSERT = "INSERT INTO user1(uname,uemail,ucountry) VALUES " + " (?, ?, ?);";

	private static final String FIND = "select * from user1 where uid =?";
	private static final String FIND_ALL = "select * from user1";
	private static final String DELETE = "delete from user1 where uid = ?;";
	private static final String UPDATE = "update user1 set uname = ?,uemail= ?, ucountry =? where uid = ?;";

	DBUtil db = new DBUtil();
	static int n;

	public int insertUser(UserBean user) throws SQLException {

		Connection con = db.getDBConnection();

		PreparedStatement ps = con.prepareStatement(INSERT);

		ps.setString(1, user.getName());
		ps.setString(2, user.getEmail());
		ps.setString(3, user.getCountry());

		n = ps.executeUpdate();

		return n;
	}

	public int deleteUser(int id) throws SQLException {

		Connection con = db.getDBConnection();

		PreparedStatement ps = con.prepareStatement(DELETE);

		ps.setInt(1, id);

		n = ps.executeUpdate();

		return n;

	}

	public int updateUser(UserBean user) throws SQLException {

		try {
			Connection con = db.getDBConnection();

			PreparedStatement ps = con.prepareStatement(UPDATE);

			System.out.println(user);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getCountry());
			ps.setInt(4, user.getId());

			n = ps.executeUpdate();
//			System.out.println(n);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return n;
	}

	public UserBean find(int id) throws SQLException {

		UserBean user = null;

		Connection con = db.getDBConnection();

		PreparedStatement ps = con.prepareStatement(FIND);

		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();

		try {
			while (rs.next()) {

				String name = rs.getString("uname");
				String email = rs.getString("uemail");
				String country = rs.getString("ucountry");

				user = new UserBean(id, name, email, country);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return user;

	}

	public List<UserBean> findAll() throws SQLException {

		List<UserBean> users = new ArrayList<>();

		UserBean user = null;

		Connection con = db.getDBConnection();

		PreparedStatement ps = con.prepareStatement(FIND_ALL);

		ResultSet rs = ps.executeQuery();

		try {
			while (rs.next()) {

				int id = rs.getInt("uid");
				String name = rs.getString("uname");
				String email = rs.getString("uemail");
				String country = rs.getString("ucountry");

				user = new UserBean(id, name, email, country);

				users.add(user);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return users;

	}

	private void printSQLException(SQLException ex) {

		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}

	}
}