package com.ten.conn;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conn {
	Connection conn = null;
	public static final String DBDRIVER="com.mysql.cj.jdbc.Driver";
	public static final String DBURL="jdbc:mysql://localhost:3306/db_select_course?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&useSSL=false&allowPublicKeyRetrieval=true";
	public static final String DBUSER="root";
	public static final String DBPASS="040203";
	
	public Connection getConn()
	{
		try{
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
		}catch(Exception e){e.printStackTrace();}
		return conn;
	}

}
