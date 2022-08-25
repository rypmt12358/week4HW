import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {
	public static void main(String args[]) {
		List<Map<String,String>> animalList = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        map.put("shark", "ocean");
        map.put("bear", "land");
        map.put("moose", "land");
        map.put("frog", "swamp");
        map.put("jelly fish", "ocean");
        map.put("heron", "swamp");
        map.put("whale", "ocean");
        animalList.add(map);
        /*
        System.out.println("animalList:");
        for(String key : map.keySet()) {
        	System.out.println(key+ " : " + map.get(key));
        };
        System.out.println("------------------------------------------------");
 		*/
        Map<String, List<String>> habitat = new HashMap<>();
        animalList.forEach(
        		m->{
        			m.forEach(
        					(value,key)->{
        						if(!habitat.containsKey(key)) {
        							habitat.put(key, new ArrayList<>());
        						}
        						habitat.get(key).add(value);
        					});
        			});
        System.out.println("habitat:");
        for(String key : habitat.keySet()) {
        	System.out.println(key + " : "+habitat.get(key));
        };
        System.out.println("------------------------------------------------");
        
        Map<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Thailand", "Bangkok");
        capitalMap.put("UK", "London");
        capitalMap.put("Australia", "Canberra");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("Egypt", "Cairo");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Italy", "Rome");
        capitalMap.put("Brazil", "Brazilia");      
        /*
        for(String s : capitalMap.keySet()) {
        	System.out.println(s + ": " + capitalMap.get(s));
        }
        System.out.println("------------------------------------------------");
        */
        capitalMap.forEach((key,value) -> {
            System.out.println(key + ": " + value);
        });

	}  
        
	
}
