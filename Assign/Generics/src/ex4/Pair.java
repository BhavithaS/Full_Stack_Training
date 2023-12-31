package ex4;

import java.util.Date;

public class Pair {
	private String key;
    private Object value;
    
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		if(value != null && value instanceof String) {
			this.value = value;
		}else if(value != null && value instanceof Date){
			this.value = value;
		}else {
			throw new IllegalArgumentException("Value is not correct");
		}
	}
	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}
    
    
}
