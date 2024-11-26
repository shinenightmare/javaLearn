package org.stream;

import java.math.BigDecimal;

public class Test2 {
    public static void main(String[] args) {
//        System.out.println(BigDecimal.valueOf(4999).compareTo(BigDecimal.valueOf(5000))==-1);
        System.out.println(true && false|| true || false);
    }
    private String getYear(String date){
        if(date!=null&&date.indexOf("-")>3) {
            date = date.substring(0, date.indexOf("-"));
        }
        return date;
    }
}
