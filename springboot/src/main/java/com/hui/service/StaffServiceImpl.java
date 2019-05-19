package com.hui.service;

import com.hui.dao.StaffDao;
import com.hui.entity.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffDao staffDao;

    @Override
    public List<Staff> getAllStaff() {
        return this.staffDao.getAllStaffs();
    }

    @Override
    public Staff getStaffById(int id) {
        return this.staffDao.getStaffById(id);
    }
}
