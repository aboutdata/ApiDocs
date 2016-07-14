package com.jdz.apidocs.uitls;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @See Link https://www.iflym.com/index.php/code/201108210002.html
 * Created by wangkun23 on 2016/7/14.
 */
public class DateUtils {

    public static final String STANDARD_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static Date parseDate(String dateString) throws ParseException {
        return getFormat().parse(dateString);
    }

    public static String format(Date date) throws ParseException {
        return getFormat().format(date);
    }

    private static ThreadLocal format = new ThreadLocal() {
        protected synchronized Object initialValue() {
            return new SimpleDateFormat(STANDARD_DATE_FORMAT);
        }
    };

    private static DateFormat getFormat() {
        return new SimpleDateFormat(STANDARD_DATE_FORMAT);
      //  return (DateFormat) format.get();
    }
}
