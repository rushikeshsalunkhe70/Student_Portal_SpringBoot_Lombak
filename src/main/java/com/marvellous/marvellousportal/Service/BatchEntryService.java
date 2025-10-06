package com.marvellous.marvellousportal.Service;

import com.marvellous.marvellousportal.Entity.BatchEntry;
import com.marvellous.marvellousportal.Repository.BatchEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BatchEntryService
{
    @Autowired
    private BatchEntryRepository batchEntryRepository;
    //C :create
    //POST
    public void saveEntry(BatchEntry batchEntry)
    {
        batchEntryRepository.save(batchEntry);
    }
    // R
    // GET
    public List<BatchEntry> getAll()
    {
       return batchEntryRepository.findAll();
    }
    //R
    public Optional<BatchEntry> findById(ObjectId id)
    {
      return  batchEntryRepository.findById(id);
    }
    // Delete
    public void deleteById(ObjectId id)
    {
        batchEntryRepository.deleteById(id);
    }
    //Update
    public void updateEntryById(ObjectId id,BatchEntry updateEntry)
    {
        batchEntryRepository.findById(id);

    }
}
