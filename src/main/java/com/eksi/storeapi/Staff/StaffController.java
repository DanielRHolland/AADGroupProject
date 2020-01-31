package com.eksi.storeapi.Staff;

import com.eksi.storeapi.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    private StaffService ul = ApplicationContext.staffService();

    @RequestMapping(value = "/getStaffMember/{id}", method = RequestMethod.GET)
    public Staff getStaff(@PathVariable("id") Integer id){
        return ul.getStaffMember(id);
    }

    @RequestMapping(value = "/getAllStaff", method = RequestMethod.GET)
    public List getAllStaff(){
        return ul.getAllStaff();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStaff(@RequestBody Staff staff) throws IOException {
        ul.update(staff);
        return "staff/success";
    }

}

