package com.smarthomepage.login;

public class LoginServiceImpl implements LoginService {
	private LoginServiceImpl() {}
	private static LoginServiceImpl instance = new LoginServiceImpl();
	public static LoginServiceImpl getInstance(){
		return instance;
	}
	@Override
	public String login(String id) {
		
		return LoginDAO.getInstance().login(id);
	}
}
