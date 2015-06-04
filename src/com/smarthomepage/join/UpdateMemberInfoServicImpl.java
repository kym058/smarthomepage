package com.smarthomepage.join;

public class UpdateMemberInfoServicImpl implements UpdateMemberInfoService {
	public UpdateMemberInfoServicImpl() {}
	private static UpdateMemberInfoServicImpl instance = new UpdateMemberInfoServicImpl();
	public static UpdateMemberInfoServicImpl getInstance(){
		return instance;
	}
	@Override
	public void UpdateMemberInfo(String id, String age, String name) {
		UpdateMemberInfoDAO.getInstance().updateMemberInfo(id, age, name);
		
	}
	
}
