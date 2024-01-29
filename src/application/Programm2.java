package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;


public class Programm2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department insert ===");
        Department department = new Department(null, "Mock Dept");
        departmentDao.insert(department);
        System.out.println("Insertion completed.");

        System.out.println("\n=== TEST 2: department update ===");
        department.setId(6);
        department.setName("Updated dept");
        departmentDao.update(department);
        System.out.println("Update completed.");


        System.out.println("\n=== TEST 3: department delete ===");
        departmentDao.deleteById(22);
        departmentDao.deleteById(23);
        departmentDao.deleteById(24);
        System.out.println("Deletion completed.");


        System.out.println("\n=== TEST 4: department findById ===");
        department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println("\n=== TEST 5: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for(Department d : list){
            System.out.println(d);
        }

    }
}
