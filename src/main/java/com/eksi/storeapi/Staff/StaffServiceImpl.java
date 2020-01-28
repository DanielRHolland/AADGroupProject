package com.eksi.storeapi.Staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffRepository cr;

    public Staff getStaffMember(Integer id){
        return cr.findById(id).orElse(null);
    }

    @Override
    public Staff update(Staff customer) throws IOException {
        return cr.save(customer);
    }

    public List getAllStaff(){
        return (List)cr.findAll();
    }

}
