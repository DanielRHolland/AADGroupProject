package com.eksi.storeapi.Staff;

import org.springframework.data.repository.CrudRepository;

public interface StaffRepository extends CrudRepository<Staff, String> {
    void deleteStaffById(String nNumber);
}
