package com.eksi.storeapi.Staff;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StaffRepository extends CrudRepository<Staff, String> {
    void delete(Optional<Staff> byId);
}
