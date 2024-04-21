package vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
	
	@JsonProperty(value = "대표전화")
	private String call;
	@JsonProperty(value = "데이터기준일자")
	private String representDate;
	@JsonProperty(value = "시군구")
	private String cityName;
	@JsonProperty(value = "시도")
	private String cityName2;
	@JsonProperty(value = "시설명")
	private String desc;
	@JsonProperty(value = "시설주소")
	private String address;
	
	public String getCall() {
		return call;
	}
	public void setCall(String call) {
		this.call = call;
	}
	public String getRepresentDate() {
		return representDate;
	}
	public void setRepresentDate(String representDate) {
		this.representDate = representDate;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityName2() {
		return cityName2;
	}
	public void setCityName2(String cityName2) {
		this.cityName2 = cityName2;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
