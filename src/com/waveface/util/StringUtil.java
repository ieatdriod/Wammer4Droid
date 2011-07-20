package com.waveface.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {
    /**
     * SimpleDateFormat pattern for an ISO 8601 date
     */
    private static String ISO_8601_DATE_FORMAT = "yyyy-MM-dd HH:mm:ssZ";
	  /**
     * Parse an ISO 8601 date converting ParseExceptions to a null result;
     */
    private static Date parseDate(String string) {
        try {
            return new SimpleDateFormat(ISO_8601_DATE_FORMAT).parse(string);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * Format a date as an ISO 8601 string, return "" for a null date
     */
    private static String formatDate(Date date) {
        if (date == null) {
            return "";
        }
        return new SimpleDateFormat(ISO_8601_DATE_FORMAT).format(date);
    }
}
