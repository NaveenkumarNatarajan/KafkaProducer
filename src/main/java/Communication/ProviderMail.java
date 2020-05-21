package Communication;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProviderMail {
	
	@JsonProperty("From") 
	private String From;
	
	@JsonProperty("FromAlias") 
	private String FromAlias;
	
	@JsonProperty("Tos") 
	private String Tos;
	
	@JsonProperty("Ccs")
	private String Ccs;
	
	@JsonProperty("Subject")
	private String Subject;
	
	@JsonProperty("Content")
	private String Content;
	
	@JsonProperty("RequestType")
	private String RequestType;
	
	@JsonProperty("From")
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	
	@JsonProperty("FromAlias") 
	public String getFromAlias() {
		return FromAlias;
	}
	public void setFromAlias(String fromAlias) {
		FromAlias = fromAlias;
	}
	
	@JsonProperty("Tos")
	public String getTos() {
		return Tos;
	}
	public void setTos(String tos) {
		Tos = tos;
	}
	
	@JsonProperty("Ccs")
	public String getCcs() {
		return Ccs;
	}
	public void setCcs(String ccs) {
		Ccs = ccs;
	}
	
	@JsonProperty("Subject")
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	
	@JsonProperty("Content")
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	
	@JsonProperty("RequestType")
	public String getRequestType() {
		return RequestType;
	}
	
	public void setRequestType(String requestType) {
		RequestType = requestType;
	}
		
}
