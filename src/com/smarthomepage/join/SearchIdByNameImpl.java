package com.smarthomepage.join;

public class SearchIdByNameImpl implements SearchIdService {
	public SearchIdByNameImpl() {}
	private static SearchIdByNameImpl instance = new SearchIdByNameImpl();
	public static SearchIdByNameImpl getInstance(){
		return instance;
	}
	@Override
	public String searchIdByName(String name) {
		// TODO Auto-generated method stub
		return SearchIdDAO.getInstance().searchId(name);
	}
	
}
