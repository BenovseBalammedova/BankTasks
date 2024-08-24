package serviceImpl;

import entity.User;
import service.CommonService;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements CommonService<User>, UserService {
    static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User(1, "John Doe", 35, "0505096247", 5000, 3500, 9.5));
        userList.add(new User(2, "Jane Smith", 25, "0705096247", 3000, 5000, 7.6));
        userList.add(new User(3, "Alice Johnson", 21, "0555096247", 1000, 400, 5));
        userList.add(new User(4, "Bob Brown", 55, "0515096247", 50000, 7000, 2.5));
    }

    @Override
    public void add(User common) {
       userList.add(common);
    }

    @Override
    public void delete(int id) {
     userList.remove(id-1);
    }

    @Override
    public User read(int id) {
        for (int i = 0; i <userList.size() ; i++) {
            if (userList.get(i).getId()==id) {
                return userList.get(i);

            }

        }
        return null;
    }

    @Override
    public void update(int id, String name) {
      User user=userList.get(id);
      user.setName(name);
      userList.add(user);
    }

    @Override
    public List<User> getAll() {
        return userList;
    }

    @Override
    public User getById(int id) {
        return userList.get(id-1);
    }

    @Override
    public List<User> getAllUserByDept(double dept) {
        return userList.stream().filter(user -> user.getDebt()>dept).toList();
    }

    @Override
    public List<User> getAllUserByAge(int age) {
        return userList.stream().filter(user -> user.getAge()>age).toList();
    }

    @Override
    public List<User> getAllUserByMonthlyIncome(double monthlyIncome) {
        return userList.stream().filter(user -> user.getMonthlyIncome()>monthlyIncome).toList();
    }

    @Override
    public List<User> getAllUserByUserScore(double userScore) {
        return userList.stream().filter(user -> user.getUserScore()>userScore).toList();
    }

    @Override
    public List<User> getAllUserByNumberPrefix(String prefix) {
        return userList.stream().filter(user -> user.getPhoneNumber().substring(0,3).equals(prefix)).toList();
    }

    @Override
    public List<User> getAllUserByName(String name) {
        return userList.stream().filter(user -> user.getName().equals(name)).toList();
    }

    @Override
    public List<User> getAllUserByAgeDistance(int age) {
        return userList.stream().map(user -> new User(user.getId(),user.getName(),user.getAge()-2,
                user.getPhoneNumber(),user.getDebt(),user.getMonthlyIncome(),
                user.getUserScore())).filter(user -> user.getAge()==18).toList();
    }


    @Override
    public List<User> getAllUserByDeptDistance(double debt) {
        return  userList.stream().filter(user -> user.getDebt()==1000).toList();

    }

    @Override
    public List<User> getAllUserByMonthlyIncomeDistance(double monthlyIncome) {
        return userList.stream().filter(user -> user.getMonthlyIncome()==100).toList();
    }
}
