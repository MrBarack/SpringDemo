package com.hui.mapper;

import com.hui.entity.Staff;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StaffMapper implements RowMapper {
    public Staff mapRow(final ResultSet rs, final int rowNum) throws SQLException {
        Staff staff = new Staff();

        staff.setId(rs.getInt("id"));
        staff.setName(rs.getString("name"));
        staff.setTitle(rs.getString("title"));
        return staff;
    }
}
