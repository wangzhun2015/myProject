package com.bskj.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wz.monitor.AirtightMontior1Application;
import com.wz.monitor.entity.HmeAirtightData;
import com.wz.monitor.service.HmeAirtightDataService;

@RunWith(SpringRunner.class)
@SpringBootApplication
@SpringBootTest(classes = AirtightMontior1Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestEquipmentInfo {
	@Autowired
	private HmeAirtightDataService service;
	@Test
	public void test1(){
		HmeAirtightData airData = new HmeAirtightData();
		String barCode = "X41#1KD253059CJ###17111746*X414XG120171117060833P*=";
		airData.setEquipmentName("123123");
		airData.setBarCode(barCode);
		airData.setScanCode("123123123");
		airData.setCollectTime(getDateStr(barCode));
		airData.setAirtightValue("21312");
		service.insert(airData);
	}
	
	/**
     * 通过条码单品条码 获取采集时间
     * @param barCode
     * @return
     * X41#1KD253059CJ###17111746*X414XG120171117060833P*=   大众
     * AD74P*20180104165133*31465319AB=   沃尔沃
     */
    private static String getDateStr(String barCode){
    	String returnTime=null;
    	String timeStr;
    	if(barCode.indexOf("###")!=-1){
    		//大众条码
    		//String[] arr  = barCode.split("[*]");
    		timeStr = barCode.substring(barCode.length()-17, barCode.length()-3);
    	}else{
    		//
    		String[] arr  = barCode.split("[*]");
    		 timeStr = arr[1];
    	}
    	String year = timeStr.substring(0,4);
		String month = timeStr.substring(4,6);
		String day = timeStr.substring(6,8);
		String hour = timeStr.substring(8, 10);
		String minitue = timeStr.substring(10, 12);
		String second = timeStr.substring(12, 14);
		returnTime = year+"-"+month+"-"+day+" "+hour+":"+minitue+":"+second;
		return returnTime;
    }
}
