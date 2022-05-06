package com.citibank.festiveoffer.offermetadata;

import java.time.LocalDate;
import java.util.List;

public class OfferMetaData {

    String offerId;
    String status;
    String source;
    LocalDate startDate;
    LocalDate endDate;
    String payload;
    List<Integer> stores;
    List<String> customerCondition;
    String category;
    String extOfferId;
    List<String> terminalTypes;
}
