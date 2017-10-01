package com.pvt;

import java.util.regex.Pattern;

public class App 
{
    private static final String PATTERN_PHONE_NUMBER = "^[1-9]\\d{2}-\\d{2}-\\d{2}$";
    private static final String PATTERN_EMAIL = "^[a-zA-Z]\\w+@[a-zA-Z]+\\.[a-zA-Z]{2,10}$";
    private static final String PATTERN_LAST_NAME = "^[A-Z]{1}[a-z]*$";
    private static final String PATTERN_NUMBER = "^\\d+$";

    public static String getTypeLine(String line){
        String response="Строка по умолчанию";
        if(!line.isEmpty()){
            if(Pattern.matches(PATTERN_PHONE_NUMBER,line)){response="Строка-номер телефона";}
            else if(Pattern.matches(PATTERN_EMAIL,line)){response="Строка-email";}
            else if(Pattern.matches(PATTERN_LAST_NAME,line)){response="Строка-фамилия";}
            else if(Pattern.matches(PATTERN_NUMBER,line)){response="Строка-номер";}
            else{response="Строка не подпала ни под один образец";}}
        return response;
    }
}
