package Class7;

import Class7.exceptions.NotCorrectPasswordException;
import Class7.exceptions.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    //Внутри класса создать статическую переменную List<User> users.
    public static List<User> users;

    //3. Выполнить инициаизацию коллекции в статическом блоке. Создать 5 пользователей и заполнить поля.
    static {
        users = new ArrayList<>();
        users.add(new User("AliceP","test1","Alice", "Petrova"));
        users.add(new User("PetrK","test2","Petr", "Kuzmich"));
        users.add(new User("ZhenuaT","test2","Zhenua", "Titov"));
        users.add(new User("PolinaK","test4","Polina", "Kukhmar"));
        users.add(new User("TayaO","test5", "Taya", "Olesheva"));
    }

    public User searchUserByLogin (String login){
        for (User user:users){
            if(user.getLogin().equals(login)){
                return user;
            }
        }
        throw new UserNotFoundException("Login not found");
    }

    public static class UserService {
        public User authenticate (String login, String password){
            UserRepository userRepository = new UserRepository();
            User user = userRepository.searchUserByLogin(login);
            if (user.getLogin().equals(login) && user.getPassword().equals(password)){
                return user;
            }
            throw new NotCorrectPasswordException("Некорректный пароль");
        }
    }
}
