package com.example.demo.service;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@WebService(serviceName="UserService", 
	targetNamespace="http://demo.example2.com",
	endpointInterface = "com.example.demo.service.AccountServeice")
@Service
public class AccountServiceImpl implements AccountServeice {
	private static User user1;
    private static User user2;
    private static User user3;

    private static List<User> userList = new ArrayList<>();
    private static Map<String, User> userMap;

    static {
        user1 = new User("1", "tom", "tom@gmail.com");
        user2 = new User("2", "jim", "jim@gmail.com");
        user3 = new User("3", "jack", "jack@gmail.com");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        userMap = (Map<String, User>) userList.stream().collect(Collectors.toMap(User::getUserId, Function.identity()));
    }

	@Override
	public User getAccountRequest(String userId, String userHeader) {
		 User user = userMap.getOrDefault(userId, new User(userId, "random", "random@gmail.com"));
        return user;
	}
}

