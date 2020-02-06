package com.eksi.storeapi.Staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffRepository cr;


    @Override
    public Staff update(Staff staff) throws IOException {
        return cr.save(staff);
    }

    @Override
    public Staff getStaffMember(String id){
        return cr.findById(id).orElse(null);
    }

    public List getAllStaff(){
        return (List)cr.findAll();
    }

    public void delete(String id) throws IOException{
        cr.delete(cr.findById(id));
    }

}
