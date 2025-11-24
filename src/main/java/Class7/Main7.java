package Class7;

import Class7.exceptions.NotCorrectPasswordException;
import Class7.exceptions.UserNotFoundException;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main7 {
    public static void main(String[] args) {
//        1. Заполнить HashMap 10 объектами <Integer, String>.
//        Найти строки у которых ключ>5. Если ключ = 0, вывести строки через запятую.

//        Map<Integer, String> entry = new HashMap<>();
//        entry.put(0, "string1");
//        entry.put(1, "string2");
//        entry.put(2, "string3");
//        entry.put(3, "string4");
//        entry.put(4, "string5");
//        entry.put(5, "string6");
//        entry.put(6, "string7");
//        entry.put(7, "string8");
//        entry.put(8, "string9");
//        entry.put(9, "string10");
//
//        System.out.println("Найти строки у которых ключ>5:");
//        Set<Integer> keys = entry.keySet();
//        int var =1;
//        for (Integer i: keys){
//            if(i>5){
//                System.out.println(entry.get(i));
//            }
//            if(i==0){
//                System.out.println(entry.values() + ", ");
//            }
//            String val = entry.get(i);
//            if(val.length() >5){
//                var = i*var;
//            }
        authentication();
       }

    public static void authentication(){
        try {
            UserRepository.UserService userService = new UserRepository.UserService();
            userService.authenticate("Masha", "test");
        }
        catch (UserNotFoundException userNotFoundException){
            System.out.println("Нет пользователя");
        }
        catch (NotCorrectPasswordException notCorrectPasswordException){
            System.out.println("Вы не прошли аутенфикацию");
        }
    }

        }



