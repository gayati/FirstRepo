package practice;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JasonExample1 {

	public static void main(String[] args) {
   JSONObject js = new JSONObject();
   js.put("name", "gayatri");
   js.put("age", 21);
   js.put("salary", 2000);
   
   JSONObject js1 = new JSONObject();
   js1.put("name", "gayati");
   js1.put("age", 2);
   js1.put("salary", 200);
  
   JSONArray arr = new JSONArray();
   arr.add("dsfdst");
   arr.add("dsfds");
   arr.add("sdg");
   System.out.println(arr);
   
   
   
   
   
   
   JSONArray model = new JSONArray();
   model.add(js);
   model.add(js1);
   System.out.println(model);
  // arr.add({"model":"dfgdf"},{"model":"dfgtrdtr"});
  
   
	}

}
