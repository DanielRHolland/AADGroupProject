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

    @GetMapping(value = "/g/{id}")
    public Staff getStaff(@PathVariable("id") Integer id){
        return ul.getStaffMember(id);
    }

    @PostMapping(value = "/l")
    public List getAllStaff(){
        return ul.getAllStaff();
    }

    @PostMapping(value = "/s")
    public String saveStaff(@RequestBody Staff staff) throws IOException {
        ul.update(staff);
        return "staff/success";
    }

}

