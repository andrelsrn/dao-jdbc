package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("===== TEST 1: department insert =====");
        Department newDepartmant = new Department(null,"Foods");
        departmentDao.insert(newDepartmant);
        System.out.println("Inserted! New id = " + newDepartmant.getId());
        System.out.println();

    }
}
