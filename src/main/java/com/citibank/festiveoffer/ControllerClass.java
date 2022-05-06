package com.citibank.festiveoffer;


import com.citibank.festiveoffer.cliptable.ClipTable;
import com.citibank.festiveoffer.cliptable.ClipTableRepository;
import com.citibank.festiveoffer.lookuptable.LookUpTable;
import com.citibank.festiveoffer.offermetadata.OfferMetaData;
import com.citibank.festiveoffer.usagetable.UsageTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class ControllerClass {

    @Autowired
    private ClipTable clipTable;
    @Autowired
    private UsageTable usageTable;
    @Autowired
    private OfferMetaData metaData;
    @Autowired
    private LookUpTable lookUpTable;
    @Autowired
    private ClipTableRepository clipRepository;



    public List<ClipTable> getClipTable(){
    List<ClipTable> clipTableList = (List<ClipTable>) clipRepository.findAll();
    return clipTableList;
    }
}
