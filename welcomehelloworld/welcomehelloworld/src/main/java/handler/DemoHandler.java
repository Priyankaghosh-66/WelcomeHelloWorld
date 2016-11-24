package handler;

import org.springframework.stereotype.Component;

import bean.UserBean;


@Component
public class DemoHandler {
	public UserBean initFlow(){
		return new UserBean();
	}

}
