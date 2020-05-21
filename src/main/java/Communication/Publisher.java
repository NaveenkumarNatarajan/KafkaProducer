package Communication;

import com.fasterxml.jackson.databind.ObjectMapper;
import Producer.KProducer;

public class Publisher{

	public static void publish(String topic, Object messageObj) {
		
		try {
			
			ObjectMapper mapper = new ObjectMapper();
		 
			KProducer.produce(topic, mapper.writeValueAsString(messageObj));
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
