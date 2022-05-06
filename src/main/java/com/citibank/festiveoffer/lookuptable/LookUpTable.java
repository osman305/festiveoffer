package com.citibank.festiveoffer.lookuptable;

import com.sun.corba.se.spi.ior.ObjectId;

import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

public class LookUpTable {

    @Id
    private ObjectId _id;
    private String type;
    private String offerId;
    private String condition;
    private String benefit;
    private String id;
    private String indicator;
    private String extOfferId;
    private List<Integer> stores;
    private LocalDate startDate;
    private LocalDate endDate;

}
