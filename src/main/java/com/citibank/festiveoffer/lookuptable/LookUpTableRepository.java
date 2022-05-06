package com.citibank.festiveoffer.lookuptable;

import com.sun.corba.se.spi.ior.ObjectId;
import org.springframework.data.repository.CrudRepository;

public interface LookUpTableRepository extends CrudRepository<LookUpTable, ObjectId> {
}
