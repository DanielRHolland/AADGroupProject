package com.eksi.storeapi.Entries;

import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;
import java.util.List;

public interface EntriesService {
    List<Entries> update(List<Entries> entries, String transactionId) throws IOException;
    List<Entries> getEntriesFromTransactionId(@PathVariable String id);
}
