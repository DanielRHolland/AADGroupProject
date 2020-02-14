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
    public Staff getStaffMember(String nNumber){
        return cr.findStaffByUsername(nNumber);
    }

    public boolean checkPassword(String nNumber, String password){
        Staff s = getStaffMember(nNumber);
        if(s.getPasswordHash().equals(password)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List getAllStaff(){
        return (List)cr.findAll();
    }

    @Override
    public void deleteById(String id) throws IOException{
        cr.deleteStaffById(id);
    }

    public int getPrivNumber(String nNumber){
        Staff f = getStaffMember(nNumber);
        if(!(f.getPrivLevel() <= -1)){
            return f.getPrivLevel();
        }else{
            return -1;
        }
    }
}
