package Communication;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProviderPhone {
	@JsonProperty("To") String To;
	@JsonProperty("From") String From;
	@JsonProperty("Body") String Body;
	@JsonProperty("RequestType") String RequestType;
	
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getBody() {
		return Body;
	}
	public void setBody(String body) {
		Body = body;
	}
	public String getRequestType() {
		return RequestType;
	}
	public void setRequestType(String requestType) {
		RequestType = requestType;
	}
	
	
}
