package com.eksi.storeapi.Staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class StaffController {


    @Autowired
    private StaffServiceImpl ul;

    @RequestMapping(value = "/staff/getStaffMember/{id}", method = RequestMethod.GET)
    public Staff getStaff(@PathVariable("id") Integer id){
        return ul.getStaffMember(id);
    }

    @RequestMapping(value = "/staff/getAllStaff", method = RequestMethod.GET)
    public List getAllStaff(){
        return ul.getAllStaff();
    }

    @RequestMapping(value = "/staff/save", method = RequestMethod.POST)
    public String saveStaff(@RequestBody Staff staff) throws IOException {
        ul.update(staff);
        return "staff/success";
    }

}

