package com.eksi.storeapi.Staff;

import com.eksi.storeapi.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private StaffService ul = ApplicationContext.staffService();

    @GetMapping(value = "g/{nNumber}")
    public Staff getStaff(@PathVariable ("nNumber")String nNumber){
        Staff staff = ul.getStaffMember(nNumber);
        Staff s = new Staff();
        s.setId(staff.getId());
        s.setPrivLevel(staff.getPrivLevel());
        s.setUsername(staff.getUsername());
        return s;
    }

    @GetMapping("/g/priv/{nNumber}")
    public int getPrivNumber(@PathVariable("nNumber")String nNumber){
        if(ul.getPrivNumber(nNumber) != -1){
            return ul.getPrivNumber(nNumber);
        }else{
            return -1;
        }
    }

    @GetMapping("g/password/{nNumber},{password}")
    public boolean checkPassword(@PathVariable("nNumber") String nNumber, @PathVariable("password") String password){
        return ul.checkPassword(nNumber,password);
    }

    @GetMapping(value = "/l")
    public List getAllStaff(){
        return ul.getAllStaff();
    }

    @PostMapping(value = "/s")
    public Staff saveStaff(@RequestBody Staff staff) throws IOException {
        ul.update(staff);
        return staff;
    }

    @DeleteMapping(value = "/d/{id}")
    public Staff deleteStaff(@PathVariable String id) throws IOException{
        ul.deleteById(id);
        return getStaff(id);
    }
}

