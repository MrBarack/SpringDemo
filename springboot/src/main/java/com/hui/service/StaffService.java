package com.hui.service;

import com.hui.entity.Staff;

import java.util.List;

public interface StaffService {
    List<Staff> getAllStaff();

    Staff getStaffById(int id);
}
