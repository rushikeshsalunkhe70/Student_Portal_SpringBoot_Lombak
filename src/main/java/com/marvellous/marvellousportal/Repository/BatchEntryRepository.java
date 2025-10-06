package com.marvellous.marvellousportal.Repository;

import com.marvellous.marvellousportal.Entity.BatchEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchEntryRepository extends MongoRepository<BatchEntry, ObjectId>
{

}
