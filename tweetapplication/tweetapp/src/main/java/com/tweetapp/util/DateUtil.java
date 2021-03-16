package com.tweetapp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.tweetapp.constants.BatchConstants;

public class DateUtil {
	public static Date convertToDate(String date) {
		Date parsedDate = null;
		try {
			SimpleDateFormat dateFormate = new SimpleDateFormat(BatchConstants.DOB_FORMAT);
			dateFormate.setLenient(false);
			parsedDate = dateFormate.parse(date);
		} catch (ParseException parseException) {
			System.out.println("Invalid Date format. Kindly enter the Date of Birth in the following format "
					+ BatchConstants.DOB_FORMAT);
		}
		return parsedDate;
	}
}