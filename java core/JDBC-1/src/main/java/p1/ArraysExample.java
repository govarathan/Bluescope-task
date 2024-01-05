package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.sql.*;
public class ArraysExample {
	//Array list to HashMap 
	public static void main(String [] args) throws Exception {
		List<String> names = new ArrayList<String>();
		
		String url="jdbc:mysql://localhost:3306/jetblue_app_db";
		String username="root";
		String password="Govarathan";
		String query="SELECT * FROM jetblue_app_db.passengers";
	  Connection con = DriverManager.getConnection(url,username,password);
	  Statement st= con.createStatement();
	  ResultSet rs=st.executeQuery(query);
	  
      while(rs.next()) {
      names.add(rs.getString(4));
      }
      
      
    con.close();
        

//		
//		names.add("Good");
//		names.add("positive");
//		names.add("vibes");
//		names.add("Good");
		
	    
	    
	    int index=0;
	    HashMap<Integer,String> map=new HashMap<>();
	    for(String name:names) {
	    	 map.put(index,name);
	    	 index++;
	    }
	    
	    System.out.println("Map of the list names : " + map);
	    
	    Set<Map.Entry<Integer, String>> entry= map.entrySet();
	    for(Map.Entry e:entry) {
	    	System.out.println("Key is "+e.getKey()+ "  and the value is "+e.getValue());
	    }
	   
	    
	}
}





































