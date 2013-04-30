package com.sivasrinivas.ShopManager.service;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class MongoService {

	private MongoClient mongo;
	private DB db;
	
	public DB getDB(){
		try{
			mongo = new MongoClient("localhost", 27017);
			db = mongo.getDB("testdb");
			DBCollection table = db.getCollection("users");
			
			BasicDBObject doc = new BasicDBObject();
			doc.put("name", "siva");
			table.insert(doc);
			
			DBCursor cursor = table.find(doc);
			while(cursor.hasNext()){
				System.out.println(cursor.next());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return db;
	}
	
}
