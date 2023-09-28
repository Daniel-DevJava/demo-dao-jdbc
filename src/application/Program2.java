package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("TEST 1: Department INSERT");
		Department newDepartment = new Department(5, "Cozinha");
		departmentDao.insert(newDepartment);
		System.out.println("Insert Id: = " + newDepartment.getId());
		
		
	}

}
