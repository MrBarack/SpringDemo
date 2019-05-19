package com.hui.controller;

import com.hui.entity.Staff;
import com.hui.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("staff")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @GetMapping("{id}")
    public Staff getStaffById(@PathVariable("id") final Integer id){
        return this.staffService.getStaffById(id);
    }
    @GetMapping("all")
    public List<Staff> getAllStaffs(){
        return this.staffService.getAllStaff();
    }
    @GetMapping("test")
    public void test(@RequestParam(value = "name") String name){
        System.out.println(name);
    }
}
