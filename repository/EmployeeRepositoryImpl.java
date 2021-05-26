package com.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Employee employee) {
		// TODO Auto-generated method stub
		int added=0;
		String INSERT_EMP="insert into emp1 values(?,?,?,?)";
		added = jdbcTemplate.update(INSERT_EMP, employee.getEmpId(),employee.getEmpName(),employee.getSalary(),employee.getEmpAddress());
		return added;
	}

	@Override
	public int update(Employee employee) {
		// TODO Auto-generated method stub
		int updated=0;
		String UPDATE_EMP="update emp1 set empname=?,,salary=?,address=? where empid=?";
		updated = jdbcTemplate.update(UPDATE_EMP,new Object[] {employee.getEmpId()},employee.getEmpName(),employee.getSalary(),employee.getEmpAddress());
		return updated;
	
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		String FIND_ALL_EMP="select * from emp1";
		List<Employee> employees=jdbcTemplate.query(FIND_ALL_EMP, (rs,rowNum)-> new Employee(rs.getInt("empid"),rs.getString(2),
				rs.getString(4),rs.getLong(3)));
		return employees;
	}

	@Override
	public List<Employee> findByNameAndSalary(String empName, long salary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> findByEmpId(int id) {
		// TODO Auto-generated method stub
		
		Optional<Employee> optional= Optional.of(new Employee());
		try {
			optional = jdbcTemplate.queryForObject("select * from emp1 where empid =? ",new Object[] {id},(rs,rowNum)-> Optional.of(new Employee(rs.getInt("empid"),rs.getString(2),
					rs.getString(4),rs.getLong(3))));
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return optional;
		
	}

	@Override
	public String getNameByEmpId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
