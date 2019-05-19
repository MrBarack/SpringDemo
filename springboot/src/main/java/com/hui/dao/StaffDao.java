package com.hui.dao;

import com.hui.entity.Staff;
import com.hui.mapper.StaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StaffDao {
    @Autowired
    private JdbcTemplate jdbcTemplateObject;

    public Staff getStaffById(final int id){
        String SQL = "select * from javashop where id =";
        Staff staff = (Staff)this.jdbcTemplateObject.queryForObject(SQL + id, new StaffMapper());
        return staff;
    }


    public void createStaffById(final int id, final String name, final String title){
        String SQL = "insert into javashop (id, name, title) values (?,?,?)";
        this.jdbcTemplateObject.update(SQL, id, name, title);
    }


    public List<Staff> getAllStaffs(){
        String SQL = "select * from javashop";
        List<Staff> allstaff = this.jdbcTemplateObject.query(SQL, new StaffMapper());
        return allstaff;
    }
}
