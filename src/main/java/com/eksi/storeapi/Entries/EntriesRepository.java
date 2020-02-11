package com.eksi.storeapi.Entries;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface EntriesRepository extends CrudRepository<Entries, String> {
    List getEntriesByTransactionId(String id);

    @Modifying
    @Transactional
    @Query("delete from Entries e where e.transactionId = :transactionId")
    void deleteByTransactionId(@Param("transactionId") String transactionId);

    boolean existsByTransactionId(String transactionId);
}
