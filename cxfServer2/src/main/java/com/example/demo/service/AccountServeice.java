package com.example.demo.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.User;


/*
서버 측 서비스인터페이스는 네임스페이스를 지정하고, 
지정된 입력 매개변수 이름을 표시해야 한다. 
(@WebService, @WebParam)
*/
@WebService(targetNamespace = "http://demo.example2.com")
public interface AccountServeice {
	
    @WebMethod(operationName = "userRequest")
    @WebResult(header = true) 
    User getAccountRequest(@WebParam(name = "userId") String userId,@WebParam(name = "header",  header = true) String userHeader);

}
