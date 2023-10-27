import java.util.HashMap;

public class hashmap_date
{
	public static void main(String[] args) {
	    String str = "12th Apr 2003";
	    
	    String date = "";
	    int i = 0;
	    while(str.charAt(i) != 's' && str.charAt(i) != 'n' && str.charAt(i) != 'r' && str.charAt(i) != 't'){
	        date = date + str.charAt(i);
	        i++;
	    }
	    
	    i=i+3;
	    
	    HashMap <String, String> mp = new HashMap <>();
	    mp.put("Jan", "01");
	    mp.put("Feb", "02");
	    mp.put("Mar", "03");
	    mp.put("Apr", "04");
	    mp.put("May", "05");
	    
	    String empmonth = "";
	    
	    while(str.charAt(i)!=' ')
	    {
	        empmonth = empmonth + str.charAt(i);
	        i++;
	    }
	    String month = mp.get(empmonth);
	    
	    i++;
	    
	    String year = "";
	    while(i < str.length()){
	        year = year + str.charAt(i);
	        i++;
	    }
	    
		System.out.println(year+"-"+month+"-"+ (date.length()==1 ? "0"+date : date));
	}
}
