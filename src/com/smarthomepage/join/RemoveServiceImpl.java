package com.smarthomepage.join;

public class RemoveServiceImpl implements RemoveService{
	public RemoveServiceImpl() {}
	private static RemoveServiceImpl instance = new RemoveServiceImpl();
	public static RemoveServiceImpl getInstance(){
		return instance;
	}
	@Override
	public void removeMember(String id) {
		RemoveDAO.getInstance().removeMember(id);
		
	}

}
