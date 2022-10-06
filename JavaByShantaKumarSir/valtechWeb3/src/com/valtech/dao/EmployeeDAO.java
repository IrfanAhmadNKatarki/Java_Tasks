package com.valtech.dao;

/*
@@Author: Irfan Ahmad


*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Class.forName("com.mysql.jdbc.Driver"); for mySQL
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static final String TABLE_NAME = "employee2";
	public int getNextValidId() throws Exception {
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select max(id) from "+TABLE_NAME);
		ResultSet rs=ps.executeQuery();
		int id=-1;
		if(rs.next()) {
			id=rs.getInt(1);
		}
		con.close();
		return id+1;
	}
	public int getNextId(int currId) throws Exception{
		int id=-1;
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select id from "+TABLE_NAME+" where id > ? fetch next 1 rows only");
		ps.setInt(1, currId);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) id=rs.getInt(1);
		con.close();
		return id;
	}
	public int getPreviousId(int currId) throws Exception{
		int id=-1;
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select max(id) from "+TABLE_NAME+" where id < ? fetch first 1 rows only");
		ps.setInt(1, currId);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) id=rs.getInt(1);
		con.close();
		return id;
	}
	
	public void updateEmployee(Employee e) throws Exception{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("UPDATE "+TABLE_NAME+ " SET name = ?,age = ?,gender = ?,salary = ? where id = ?  ");
		ps.setInt(5, e.getId());
		ps.setString(1, e.getName());
		ps.setInt(2, e.getAge());
		ps.setInt(3, e.getGender());
		ps.setDouble(4, e.getSalary());
		
		int rowsAffected = ps.executeUpdate();
		con.close();
		
	}
	
	public void deleteEmployee(int id ) throws Exception{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("delete from "+TABLE_NAME+" where id = ?");
		ps.setInt(1, id);
		ps.executeUpdate();
		con.close();
	}
	
	public List<Employee> getEmployees() throws Exception{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select id,name,age,gender,salary from "+TABLE_NAME);
		ResultSet rs = ps.executeQuery();
		List<Employee> employees= new ArrayList<>();
		while(rs.next()) {
			employees.add(employeeFromResultSet(rs));
		}
		con.close();
		return employees;
	}
	
	public Employee getEmployee(int id ) throws Exception{
		Connection conn=getConnection();
		PreparedStatement ps=conn.prepareStatement("SELECT id,name,age,gender,salary from "+TABLE_NAME+" where id = ?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			Employee e =employeeFromResultSet(rs);
			/*Employee e=new Employee();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setAge(rs.getInt(3));
			e.setGender(rs.getInt(4));
			e.setSalary(rs.getFloat(5));*/
			conn.close();
			return e;
				
		} else {
			return null;
		}
		
		
		
		//conn.getMetaData().getTablePrivileges(employeet, schemaPattern, tableNamePattern)
	}

	private Employee employeeFromResultSet(ResultSet rs) throws SQLException {
		Employee e=new Employee();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setAge(rs.getInt(3));
		e.setGender(rs.getInt(4));
		e.setSalary(rs.getFloat(5));
		return e;
	}
	
	public void saveEmployee(Employee e) throws Exception{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into "+TABLE_NAME+ " (id,name,age,gender,salary) values (?,?,?,?,?)");
		ps.setInt(1, e.getId());
		ps.setString(2, e.getName());
		ps.setInt(3, e.getAge());
		ps.setInt(4, e.getGender());
		ps.setDouble(5, e.getSalary());
		
		int rowsAffected = ps.executeUpdate();
		con.close();
	}

	public int count() throws Exception {
		Connection con = getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select count(id) from " + TABLE_NAME);
		if (rs.next()) {
			int count = rs.getInt(1);
			con.close();
			return count;

		} else {
			con.close();
			return -1;
		}
	}

	public Connection getConnection() throws Exception {
		return DriverManager.getConnection("jdbc:oracle:thin:@192.168.102.35:1521/xe", "valtrg23", "valtrg23");
		// return DriverManager.getConnection("jdbc:mysql://localhost:3306/valtech","username","password");for mysql 
		//return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","username","password");
	}
	
	public List<Employee> getEmployeeByAge(int age) throws Exception{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("SELECT id,name,age,gender,salary FROM "+TABLE_NAME+" where age = ?");
		ps.setInt(1, age);
		ResultSet sq = ps.executeQuery();
		List<Employee> emp=new ArrayList<>();
		while(sq.next()) {
			emp.add(employeeFromResultSet(sq));
		}
		con.close();
		return emp;
		
		
	
		
	}

	
	public List<Employee> getEmployeeByMale(int gender) throws Exception{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("SELECT id,name,age,gender,salary FROM "+TABLE_NAME+" where gender = ?");
		ps.setInt(1, gender);
		ResultSet gm = ps.executeQuery();
		List<Employee> emp=new ArrayList<>();
		while(gm.next()) {
			emp.add(employeeFromResultSet(gm));
		}
		con.close();
		return emp;
		
		
	
		
	}
	
	public List<Employee> getEmployeeByFemale(int gender) throws Exception{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("SELECT id,name,age,gender,salary FROM "+TABLE_NAME+" where gender = ?");
		ps.setInt(1, gender);
		ResultSet mp = ps.executeQuery();
		List<Employee> emp=new ArrayList<>();
		while(mp.next()) {
			emp.add(employeeFromResultSet(mp));
		}
		con.close();
		return emp;
		
		
	
		
	}
	


	public List<Employee> getEmployeeByOthers(int gender) throws Exception{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("SELECT id,name,age,gender,salary FROM "+TABLE_NAME+" where gender=?");
		ps.setInt(-1, gender);
		ResultSet ot=ps.executeQuery();
		List<Employee> emp=new ArrayList<>();
		while(ot.next()) {
			emp.add(employeeFromResultSet(ot));
		}
		con.close();
		return emp;
	}
	
	
	public List<Employee> getEmployeeByAgeBetween(int minage,int maxage) throws Exception{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("SELECT id,name,age,gender,salary FROM "+TABLE_NAME+" WHERE age BETWEEN ? and ? ");
		ps.setInt(1, minage);
		ps.setInt(2, maxage);
		ResultSet abt = ps.executeQuery();
		List<Employee> emp=new ArrayList<>();
		while(abt.next()) {
			emp.add(employeeFromResultSet(abt));
		}
		con.close();
		return emp;
	}
	public List<Employee> getEmployeeBySalaryGreaterThan(int sal) throws Exception{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("SELECT id,name,age,gender,salary FROM "+TABLE_NAME+" WHERE salary > ? ");
		ps.setInt(1, sal);
		ResultSet slgt = ps.executeQuery();
		List<Employee> emp=new ArrayList<>();
		while(slgt.next()) {
			emp.add(employeeFromResultSet(slgt));
		}
		con.close();
		return emp;
	}
	
	public List<Employee> getEmployeeBySalaryLessThan(int sal) throws Exception{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("SELECT id,name,age,gender,salary FROM "+TABLE_NAME+" WHERE salary < ? ");
		ps.setInt(1, sal);
		ResultSet sllt = ps.executeQuery();
		List<Employee> emp=new ArrayList<>();
		while(sllt.next()) {
			emp.add(employeeFromResultSet(sllt));
		}
		con.close();
		return emp;
	}
	public int getFirstId() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps=con.prepareStatement("select min(id) from "+TABLE_NAME);
        ResultSet rs = ps.executeQuery();
        int id = -1;
        if(rs.next()) {
            id = rs.getInt(1);
        }
        con.close();
        return id;
    }
    
    public int getLastId() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps=con.prepareStatement("select max(id) from "+TABLE_NAME);
        ResultSet rs = ps.executeQuery();
        int id = -1;
        if(rs.next()) {
            id = rs.getInt(1);
        }
        con.close();
        return id;
    }

}
