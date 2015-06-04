package com.smarthomepage.join;

public class SearchPwdServiceImpl implements SearchPwdService {
	public SearchPwdServiceImpl() {}
	private static SearchPwdServiceImpl instance = new SearchPwdServiceImpl();
	public static SearchPwdServiceImpl getInstance(){
		return instance;
	}
	@Override
	public String searchPwdByName(String name) {
		
		return SearchPwdDAO.getInstance().searchPwdByName(name);
	}

}
