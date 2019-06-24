package com.autom.dataDriven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

public abstract class Mongo {
	
	public MongoOperations createMongoConnection() {
		ApplicationContext ctx = new GenericXmlApplicationContext("SpringConfig.xml");
		// For Annotation
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
		return mongoOperation;
	}
	

}
