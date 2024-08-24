package service;

import entity.User;

import java.util.List;

public interface UserService {
    List<User>getAllUserByDept(double dept);

    List<User> getAllUserByAge(int age);

    List<User> getAllUserByMonthlyIncome(double monthlyIncome);

    List<User> getAllUserByUserScore(double userScore);

    List<User> getAllUserByNumberPrefix(String prefix);

    List<User> getAllUserByName(String name);

    List<User> getAllUserByAgeDistance(int age);

    List<User> getAllUserByDeptDistance(double debt);

    List<User> getAllUserByMonthlyIncomeDistance(double monthlyIncome);
}
