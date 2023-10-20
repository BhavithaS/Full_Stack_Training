package collection1;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class main {

	public static void main(String[] args) {
		
		Comparator<Long> comparator = new Comparator<Long>() {
			
			@Override
			public int compare(Long o1, Long o2) {
				if(o1 > o2) {
					return -1;
				}else {
					return 1;
				}
				// TODO Auto-generated method stub
			}
		};
        Map<Long,Contact> phoneNumbers = new TreeMap<>(comparator);
        phoneNumbers.put(111111111L, new Contact(111111111L,"Hari","hari89@gmail.com",Gender.MALE));
        phoneNumbers.put(999999999L, new Contact(999999999L,"Hari","hari89@gmail.com",Gender.MALE));
        phoneNumbers.put(888888888L, new Contact(888888888L,"Harshita","harshita@gmail.com",Gender.FEMALE));
        
//        System.out.println(phoneNumbers);
        for(Long key : phoneNumbers.keySet()) {
        	System.out.println(key);
        }
        
        for(Contact contact : phoneNumbers.values()) {
        	System.out.println(contact);
        }
        for(Entry<Long, Contact> entry : phoneNumbers.entrySet() ) {
        	System.out.println(entry.getKey());
        	System.out.println(entry.getValue());
        }

	}

}
