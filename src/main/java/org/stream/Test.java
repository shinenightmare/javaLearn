package org.stream;

import java.text.ParseException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws ParseException {
        List<User> users=TempDataFactory.getUser();

//        System.out.println(users.stream().collect(
//                Collectors.averagingDouble(User::getAge)
//        ));
//        System.out.println(users.stream().collect(Collectors.counting()));
//        for(User user:collect){
//            System.out.println(user.getName());
//        }
//        System.out.println(
//                users.stream().collect(
//                        Collectors.groupingBy(user -> user.getAge(),Collectors.reducing(0,e->1,Integer::sum))
//                )
//        );

/*        Map<Integer, Optional<User>> map=users.stream().collect(Collectors.groupingBy(
                        User::getAge,
                        Collectors.maxBy(new Comparator<User>() {
                            @Override
                            public int compare(User o1, User o2) {
                                if(o1.getBirth().before(o2.getBirth())){
                                    return 1;
                                }
                                return 0;
                            }
                        })
                ));
        for(Object o:map.keySet()){
            System.out.println(o+":"+map.get(o).get().getName());
        }*/


    }
}
