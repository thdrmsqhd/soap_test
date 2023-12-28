package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.model.UserInput;
import com.example.demo.model.UserOutput;

@WebService(serviceName="UserService", 
	targetNamespace="http://demo.example.com",
	endpointInterface = "com.example.demo.service.UserService")
@Service
public class UserServiceImpl implements UserService {
	private static User user1;
    private static User user2;
    private static User user3;

    private static List<User> userList = new ArrayList<>();
    private static Map<String, User> userMap;
    AccountServiceImpl account = new AccountServiceImpl();
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
	public UserOutput getUserRequest(User user, UserInput user2) {
		UserOutput output =  new UserOutput();
//		 User user = userMap.getOrDefault(userId, new User(userId, "random", "random@gmail.com"));
        return output;
	}
}

