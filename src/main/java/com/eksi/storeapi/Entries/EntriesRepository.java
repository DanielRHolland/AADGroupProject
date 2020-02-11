package com.eksi.storeapi.Entries;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntriesRepository extends CrudRepository<Entries, String> {
    List getEntriesByTransactionId(String id);
}
