package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class ObjectStreamExample {
public static void main(String[] args) {
	Map<String,Integer> map=new HashMap<>();
	map.put("aastha",987);
	map.put("pratiksha",986);
	map.put("swarna",985);
	map.put("sneha",999);
	try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/object.data"))){
		oos.writeObject(map);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
	try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/object.data"))){
		try {
			Object obj=ois.readObject();
			if(obj!=null && obj instanceof Map) {
				Map<?,?> map1=(Map<?,?>)obj;
				map1.forEach((K,V)->System.out.println(K+" "+V));
			}
		
		}catch(ClassNotFoundException e) {
			
		}
		
	}catch(FileNotFoundException e) {
		
	}catch(IOException e) {
		
	}
    
}
}
		
