package Application;

import org.eclipse.jetty.servlets.CrossOriginFilter;

import API.ProducerAPI;
import io.dropwizard.Application;
import io.dropwizard.jersey.jackson.JsonProcessingExceptionMapper;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;

import Configuration.BootstrapConfig;

import java.util.EnumSet;

public class KafkaProducerApp extends Application<BootstrapConfig>{
	 public static void main(String[] args) throws Exception {
	        new KafkaProducerApp().run(args);
	    }
	 
	 	@Override
	    public void initialize(Bootstrap<BootstrapConfig> bootstrap) {
	        // nothing to do yet
	    }

	    @Override
	    public void run(BootstrapConfig configuration, Environment environment) {	    	
	    	    
    	    System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
    		final FilterRegistration.Dynamic cors =
    		        environment.servlets().addFilter("CORS", CrossOriginFilter.class);

    		// Configure CORS parameters
    	    cors.setInitParameter("allowedOrigins", "*");
    	    cors.setInitParameter("allowedHeaders", "*");
    	    cors.setInitParameter("allowedMethods", "OPTIONS,GET,PUT,POST,DELETE,HEAD");

    		    // Add URL mapping
    		cors.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");	    
    		final ProducerAPI resource = new ProducerAPI();
    	    environment.jersey().register(resource);
    	    environment.jersey().register(new JsonProcessingExceptionMapper(true));
	    }

}
