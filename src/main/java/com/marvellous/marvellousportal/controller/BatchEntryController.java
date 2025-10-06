package com.marvellous.marvellousportal.controller;

import com.marvellous.marvellousportal.Entity.BatchEntry;
import com.marvellous.marvellousportal.Service.BatchEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import static org.apache.tomcat.util.net.openssl.OpenSSLStatus.getName;

@RestController

@RequestMapping("/Batches")
public class BatchEntryController
{
    @GetMapping
    public List<BatchEntry> getall()
    {
        return batchEntryService.getAll();
    }
@Autowired
   private BatchEntryService batchEntryService;
    @PostMapping
    public String createEntry(@RequestBody BatchEntry myentry)
    {
        batchEntryService.saveEntry(myentry);
        return  "Document inserted successfully";
    }

    @GetMapping("/id/{myid}")
    public BatchEntry getBatchEntryById(@PathVariable ObjectId myid)
    {
        return batchEntryService.findById(myid).orElse(null);

    }

    @DeleteMapping("/id/{myid}")
    public  boolean deleteEntryById(@PathVariable ObjectId myid)
    {
         batchEntryService.deleteById(myid);
         return true;
    }

    @PutMapping("/id/{myid}")
    public void updateEntryById(@PathVariable ObjectId myid,@RequestBody BatchEntry myentry)
    {
      BatchEntry old =  batchEntryService.findById(myid).orElse(null);
      if(old != null)
      {
          old.setName(myentry,getName());
          old.setFees(myentry, old.getFees());
          batchEntryService.saveEntry(old);
      }

    }
}
