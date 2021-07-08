package com.example.hanruweather.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
 */
public class DateUtils {

    public static String getCurrentDate(){
        Date date = new Date();
        SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = sdf.format(date);
        return dateStr;
    }

    /**
     * 获取今天星期几
     * @return
     */
    public static String getWeekOfCurrentDay(){
        String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);
        return weekDays[week-1];
    }

    /**
     * 获取当前的日期，对应的星期
     * @param dateStr ,2021-07-09 12:00:00
     *
     * @return
     */
    public static String getWeek(String dateStr){
        String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};

        SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        try {
            Date date = sdf.parse(dateStr);
            cal.setTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int week = cal.get(Calendar.DAY_OF_WEEK)-1;
        if(week < 0){
            week = 0;
        }


        return weekDays[week];
    }

    /**
     * 根据给定的日期时间，获取日期
     * @param dateStr
     * @return
     */
    public static String getDate(String dateStr){

        SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        try {
            Date date = sdf.parse(dateStr);
            return sdf2.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }
}
