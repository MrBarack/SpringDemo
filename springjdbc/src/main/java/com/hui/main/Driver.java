package com.hui.main;

import com.hui.dao.StaffDao;
import com.hui.entity.Staff;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        StaffDao dao = (StaffDao) context.getBean("staffDAO");
//        Staff onestaff = dao.getStaffById(2);
        dao.createStaffById(4, "haha", "test4");
        List<Staff> all = dao.getAllStaffs();

        for (int i = 0; i < all.size(); i++) {
            System.out.println("ID= " + all.get(i).getId());
            System.out.println("Name= " + all.get(i).getName());
            System.out.println("Title= " + all.get(i).getTitle());
        }
    }
}
