package com.wz.monitor.util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author wangzhun
 *
 */
public class BsDateUtil {

	private final static String FULL_FORMAT = "yyyy-MM-dd HH:mm:ss";

	private final static String SIMPLE_FORMAT = "yyyy-MM-dd";

	/**
	 * 得到当前日期的年-月-日 时:分:秒
	 * 
	 * @return
	 */
	public static String getCurrentDateToString() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat(FULL_FORMAT);
		return df.format(calendar.getTime());
	}

	/**
	 * 得到当前日期的年-月-日
	 * 
	 * @return
	 */
	public static String getCurrentDateSimpleToString() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat(SIMPLE_FORMAT);
		return df.format(calendar.getTime());
	}

	/**
	 * 得到当天到下周的日期
	 * 
	 * @return
	 */
	public static String getNextWeekToString() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_WEEK, +6);
		SimpleDateFormat df = new SimpleDateFormat(SIMPLE_FORMAT);
		return df.format(calendar.getTime());
	}

	/**
	 * 得到明天的时间
	 * 
	 * @return
	 */
	public static String getNextDayToString(String day) {
		String result = "";
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat(SIMPLE_FORMAT);
		try {
			calendar.setTime(df.parse(day));
			calendar.add(Calendar.DAY_OF_WEEK, +1);
			result = df.format(calendar.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 字符串日期转Date类型
	 * 
	 * @param str
	 * @return
	 */
	public static Date stringToSimpleDate(String str) {
		SimpleDateFormat df = new SimpleDateFormat(SIMPLE_FORMAT);
		try {
			return df.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 字符串日期转Date类型
	 * 
	 * @param str
	 * @return
	 */
	public static Date stringToFullDate(String str) {
		SimpleDateFormat df = new SimpleDateFormat(FULL_FORMAT);
		try {
			return df.parse(str);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * Date类型转字符串日期
	 * 
	 * @param str
	 * @return
	 */
	public static String dateToSimpleString(Date date) {
		SimpleDateFormat df = new SimpleDateFormat(SIMPLE_FORMAT);
		return df.format(date);
	}

	/**
	 * 根据日期得到星期几
	 * 
	 * @param date
	 * @return
	 */
	public static String getWeekChinese(String date) {
		String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat(SIMPLE_FORMAT);
		try {
			cal.setTime(df.parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (w < 0)
			w = 0;
		return weekDays[w];
	}

	/**
	 * 判断两个时间的大小 是否后面那个大小前面那个 格式 yyyy-MM-dd
	 * 
	 * @param startDate
	 * @param endDate
	 * @return true为是 false为否
	 */
	public static boolean judgeDate(String startStr, String endStr) {
		Date startDate = stringToSimpleDate(startStr);
		Date endDate = stringToSimpleDate(endStr);
		
		if (startDate!=null&&endDate!=null&&startDate.before(endDate)) {
			return true;
		}
		return false;
	}

	/**
	 * 判断两个时间的大小 是否后面那个大小前面那个 格式 yyyy-MM-dd HH:mm:ss
	 * 
	 * @param startDate
	 * @param endDate
	 * @return true为是 false为否
	 */
	public static boolean judgeFullDate(String startStr, String endStr) {
		Date startDate = stringToFullDate(startStr);
		Date endDate = stringToFullDate(endStr);
		if(startDate!=null&&endDate!=null){
			if (startDate.before(endDate)) {
				return true;
			}
		}
		
		return false;
	}

	/**
	 * 得到多少天的日期 正数为加 负数为减
	 * 
	 * @param str
	 * @param day
	 * @return
	 */
	public static String getNumAfterDate(String str, int day) {
		Date startDate = stringToSimpleDate(str);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);
		calendar.add(Calendar.DAY_OF_WEEK, day);
		return dateToSimpleString(calendar.getTime());
	}

	/**
	 * 将UNIXTIME转为普通的时间
	 * 
	 * @param unixTime
	 * @return
	 */
	public static String unixTimeToString(String unixTime) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(Long.parseLong(unixTime));
		return dateToSimpleString(c.getTime());
	}

	/**
	 * 将普通的日间转为UNIXTIME
	 * 
	 * @param date
	 * @return
	 */
	public static String stringToUnixTime(String date) {
		Calendar c = Calendar.getInstance();
		Date date2 = stringToSimpleDate(date);
		c.setTime(date2);
		return c.getTimeInMillis() + "";

	}

	/**
	 * 计算两个时间小时差
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 * @throws Exception
	 */
	public static double jisuan(String date1, String date2) throws Exception {
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-M-d HH:mm:ss");
		java.util.Date start = sdf.parse(date1);
		java.util.Date end = sdf.parse(date2);
		long cha = end.getTime() - start.getTime();
		double result = cha * 1.0 / (1000 * 60 * 60);
		return result;
	}

	/*
	 * public static void main(String[] args) throws Exception { String date1 =
	 * "2012-3-12 10:43:32"; String date2 = "2012-3-13 16:00:00";
	 * System.out.println("相差" + jisuan(date1, date2) + "小时"); }
	 */
	/**
	 * 
	 * @param begingTime
	 * @param endTime
	 * @return 返回的为秒数
	 * @throws ParseException 
	 */
	public static String beTweenTime(String begingTime, String endTime) {
		long cha =0;
		try {
			java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-M-d HH:mm:ss");
			java.util.Date start = sdf.parse(begingTime);
			java.util.Date end = sdf.parse(endTime);
			 cha = end.getTime() - start.getTime();
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		// double result = cha * 1.0 / (1000 * 60 * 60);
		String ss = ((int) (cha * 1.0 / 1000)) + "";
		return ss;
	}

	public static String getFirstDayOfMonth(Date now) throws ParseException {
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		c.set(Calendar.DAY_OF_MONTH, 1);
		String format = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
		format += " 00:00:00";
		return format;
	}

	public static String getFirstDayOfWeek(Date now) throws ParseException {
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); 
		String format = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
		format += " 00:00:00";
		return format;
	}

	public static String getToDay(Date now) throws ParseException {
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		String format = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
		format += " 00:00:00";
		return format;
	}
	/**
	 * 计算日期减去多少秒后的时间
	 * @param date
	 * @param mills
	 * @return
	 */
	public static String getTimeMill(Date date,int mills){
		long timemill = date.getTime();
		timemill = timemill-(mills*1000);
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(timemill);
		SimpleDateFormat df = new SimpleDateFormat(FULL_FORMAT);
		return df.format(c.getTime());
	}
}
