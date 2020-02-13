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
        s.setNNumber(staff.getNNumber());
        return s;
    }

    @PostMapping(value = "/l")
    public List getAllStaff(){
        return ul.getAllStaff();
    }

    @PostMapping(value = "/s")
    public String saveStaff(@RequestBody Staff staff) throws IOException {
        ul.update(staff);
        return "staff/save/success";
    }

    @DeleteMapping(value = "/d/{id}")
    public String deleteStaff(@PathVariable String id) throws IOException{
        ul.deleteById(id);
        return "staff/delete/success";
    }
}

