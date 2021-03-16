package com.tweetapp.constants;

import java.util.regex.Pattern;

public class BatchConstants {

	public static final String DOB_FORMAT = "yyyy/MM/dd";

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);
	public static final String GET_ALL_TWEETS = "SELECT message FROM post ";
	public static final String GET_USER_TWEETS = "SELECT message FROM post WHERE us_email = ? ";
	public static final String SAVE_TWEET = "INSERT INTO post(message,us_email)values(?,?)";

	public static final String GET_ALL_USERS = "SELECT us_f_name FROM user ";
	public static final String SAVE_USER = "INSERT INTO user (`us_f_name`, `us_l_name`, `us_gender`, `us_dob`, `us_email`, `us_password`)  VALUES (?,?,?,?,?,?)";
	public static final String GET_USER = "SELECT us_email, us_password from user WHERE us_email = ?";

	public static final String RESET_PASSWORD = "UPDATE user SET us_password = ? WHERE us_email = ?";

}