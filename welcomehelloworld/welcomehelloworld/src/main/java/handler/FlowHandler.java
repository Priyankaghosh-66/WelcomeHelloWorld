package handler;

import org.springframework.stereotype.Component;

import bean.UserBean;

@Component
public class FlowHandler {
	public UserBean initFlow(){
		return new UserBean();
	}

}
