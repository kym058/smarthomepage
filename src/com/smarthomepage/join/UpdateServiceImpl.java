package com.smarthomepage.join;

public class UpdateServiceImpl implements UpdateService {
	public UpdateServiceImpl() {}
	private static UpdateServiceImpl instance = new UpdateServiceImpl();
	public static UpdateServiceImpl getInstance(){
		return instance;
	}
	@Override
	public void updateMember(String id, String pwd) {
		UpdateDAO.getInstance().updateMember(id, pwd);
		
	}

}
