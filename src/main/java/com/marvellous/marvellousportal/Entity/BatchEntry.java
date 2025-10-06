package com.marvellous.marvellousportal.Entity;

import org.apache.tomcat.util.net.openssl.OpenSSLStatus;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "BatchDetails")
public class BatchEntry
{
    @Id
    private ObjectId id;
    private String name;
    private int fees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectId getId()
    {
        return id;
    }

    public void setId(ObjectId id)
    {
        this.id = id;
    }

    public int getFees()
    {
        return fees;
    }

    public void setFees(BatchEntry myentry, int fees) {
        this.fees = fees;
    }

    public void setName(BatchEntry myentry, OpenSSLStatus.Name name) {
        
    }
}
