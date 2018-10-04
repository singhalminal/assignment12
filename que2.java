import java.util.*;
class que2
{
	public static void main(String[] args)
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("the","the mummy");
		hm.put("city","the tale of two cities");
		hm.put("pink","pink panther");
		String s;
		/*s=hm.get("pink");
		System.out.println(s);
		s=hm.get("the");
		System.out.println(s);
		s=hm.get("city");
		System.out.println(s);*/
		Set /*<Map.Entry<String,String>>*/ s1=hm.entrySet();
		Iterator it=s1.iterator();
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();
			System.out.println("key=>"+me.getKey());
			System.out.println("Value=>"+me.getValue());

		}
	}
}