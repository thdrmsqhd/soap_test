package com.example.demo.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


import com.example.demo.model.User;
import com.example.demo.model.UserInput;
import com.example.demo.model.UserOutput;


/*
서버 측 서비스인터페이스는 네임스페이스를 지정하고, 
지정된 입력 매개변수 이름을 표시해야 한다. 
(@WebService, @WebParam)
*/
@WebService(targetNamespace = "http://demo.example.com")
public interface UserService {
	
    @WebMethod(operationName = "userRequest")
    UserOutput getUserRequest(@WebParam(name = "user") User user,
    		@WebParam(name = "systemName",  header = true) UserInput user2);

}
