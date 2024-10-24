package com.bikash.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("hDetails")
public class HotelDetails {
	@Value("40155")
	private Integer hID;
	@Value("${hotel.hname}")
	private String hName;
	@Value("${hotel.haddress}")
	private String hAddress;
	@Value("${hotel.hmblno}")
	private Long hMblNo;
	
	@Value("${customer.name}")
	private String customerName;
	@Value("#{hotelMenu.idli+hotelMenu.dosa+hotelMenu.bada}")
	private Double totalBill;
	
	@Value("${os.name}")
	private String device;

	@Override
	public String toString() {
		return "HotelDetails [hID=" + hID + ", hName=" + hName + ", hAddress=" + hAddress + ", hMblNo=" + hMblNo
				+ ", customerName=" + customerName + ", totalBill=" + totalBill + ", device=" + device + "]";
	}

	
	
}
