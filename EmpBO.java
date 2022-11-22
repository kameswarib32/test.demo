package org.simplilearn;

import java.util.ArrayList;
import java.util.List;

public class EmpBO {
	private List<Emp> employees=new ArrayList<>();
	public EmpBO() {
		employees.add(new Emp(1, "suresh", "Chennai"));
		employees.add(new Emp(2, "vamsi", "Hyderabad"));
		employees.add(new Emp(3, "Arun", "Chennai"));
	}
	public void addEmployee(Emp e)
	{
		employees.add(e);
	}
	public boolean deleteEmployee(int eno)
	{
		boolean isDeleted=false;
		Emp e1=null;
		for(Emp e:employees)
		{
			if(e.getEno()==eno)
			{
				e1=e;
			}
		}
		if(employees.remove(e1))
			isDeleted=true;
		return isDeleted;
	}
	public List<Emp> getEmployees()
	{
		return employees;
	}
	public Emp getEmployee(int eno)
	{
		Emp e1=null;
		for(Emp e:employees)
		{
			if(e.getEno()==eno)
				e1=e;
		}
		return e1;
	}
	public void updateEmployee(int eno,Emp emp)
	{
		Emp e1=null;
		for(Emp e:employees)
		{
			if(e.getEno()==eno)
				e1=e;
		}
		e1.setName(emp.getName());
		e1.setAddress(emp.getAddress());
	}
	
}
