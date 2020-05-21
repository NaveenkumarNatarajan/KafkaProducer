package Producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class KProducer {

	public static void produce(String topic, String message) {
	
		 Producer<String, String> producer = new KafkaProducer<String, String>(ProducerConfig.SetProducerConfig());
        
	     producer.send(new ProducerRecord<String, String>(topic, message));
	     
	     producer.close();
	}
}
