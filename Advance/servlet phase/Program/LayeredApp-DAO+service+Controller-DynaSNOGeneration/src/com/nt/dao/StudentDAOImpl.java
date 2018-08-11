package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String INSERT_STUDENT_QUERY="INSERT INTO LAYERED_STUDENT VALUES(?,?,?,?,?)";
	private static final String  GET_SNO_BY_SEQUENCE="SELECT STNO_SEQ1.NEXTVAL FROM DUAL";
	
	public Connection getConnection()throws Exception{
		InitialContext ic=null;
		DataSource ds=null;
		Connection con=null;
		//method get connection obj from jdbc con pool
		ic=new InitialContext();
		ds=(DataSource)ic.lookup("java:/comp/env/DsJndi");
		con=ds.getConnection();
       return con;		
	}
	
	public int  generateStudentNumber()throws Exception{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int sno=0;
		//get connection 
		con=getConnection();
		//create PrparedStatement object
		ps=con.prepareStatement(GET_SNO_BY_SEQUENCE);
		//send and execute SQL Query
		rs=ps.executeQuery();
		//process the ResultSet
		 if(rs.next()){
			 sno=rs.getInt(1);
		 }
		return sno;
	}//method

	@Override
	public int insert(StudentBO bo) throws Exception{
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		//get Connection obj from jdbc con pool
		con=getConnection();
		//create PreparedStatement object
		ps=con.prepareStatement(INSERT_STUDENT_QUERY);
		//set values to Query params
		ps.setInt(1,generateStudentNumber());
		ps.setString(2,bo.getSname());
		ps.setInt(3,bo.getTotal());
		ps.setFloat(4,bo.getAvg());
		ps.setString(5,bo.getResult());
		//send and execute SQL Query
		result=ps.executeUpdate();
			return result;
	}//method
}//class