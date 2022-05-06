package com.citibank.festiveoffer.cliptable;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Clip_Table2")
public class ClipTable {

    @Id
    private String clipId;
    private String offerId;
    private String storeId;
    private String hhId;
    private String status;
    private String extOfferId;
    private LocalDate clipTimestamp;
    private LocalDate offerEndDate;
    private LocalDate createdDate;
    private LocalDate lastUpdatedDate;
}
