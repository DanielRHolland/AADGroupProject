package com.eksi.storeapi.Staff;

import java.io.IOException;
import java.util.List;

public interface StaffService {
    Staff update(Staff staff) throws IOException;
    Staff getStaffMember(String id);
    void delete(String id) throws IOException;
    List getAllStaff();
}
