package org.stream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TempDataFactory {
    public static List<User> getUser() throws ParseException {
        List<User> users=new ArrayList<>();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-DD-mm");
        Department techDepartment=new Department("1","科技部",5);
        Department taxDepartment=new Department("2","税务部",3);
        Department officeDepartment=new Department("3","事业部",4);
        User user1=new User("1","user_one",25,sdf.parse("1999-02-21"),techDepartment);
        User user2=new User("2","user_two",25,sdf.parse("1999-06-25"),techDepartment);
        User user3=new User("3","user_three",31,sdf.parse("1993-11-23"),techDepartment);
        User user4=new User("4","user_four",23,sdf.parse("2001-04-11"),techDepartment);
        User user5=new User("5","user_five",26,sdf.parse("1998-12-21"),taxDepartment);
        User user6=new User("6","user_six",21,sdf.parse("2003-04-22"),taxDepartment);
        User user7=new User("7","user_seven",30,sdf.parse("1994-09-02"),taxDepartment);
        User user8=new User("8","user_eight",27,sdf.parse("1997-11-29"),taxDepartment);
        User user9=new User("9","user_nine",19,sdf.parse("2005-10-04"),officeDepartment);
        User user10=new User("10","user_ten",25,sdf.parse("1999-02-16"),officeDepartment);
        User user11=new User("11","user_eleven",25,sdf.parse("1999-06-26"),officeDepartment);
        User user12=new User("12","user_twelve",23,sdf.parse("2001-01-01"),officeDepartment);
        User user13=new User("13","user_thirteen",31,sdf.parse("1993-09-23"),officeDepartment);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);
        users.add(user11);
        users.add(user12);
        users.add(user13);
        return users;
    }
}
