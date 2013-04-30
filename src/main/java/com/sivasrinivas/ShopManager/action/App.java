package com.sivasrinivas.ShopManager.action;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try{
			MongoClient mongo = new MongoClient("localhost", 27017);
			DB db = mongo.getDB("testdb");
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
		
	}
	
	public String execute(){
		System.out.println("Action executed!");
		return "success";
	}

}
