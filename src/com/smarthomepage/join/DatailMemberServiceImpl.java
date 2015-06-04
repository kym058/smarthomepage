package com.smarthomepage.join;

public class DatailMemberServiceImpl implements DatailMemberService {
	public DatailMemberServiceImpl() {}
	private static DatailMemberServiceImpl instance = new DatailMemberServiceImpl();
	public static DatailMemberServiceImpl getInstance(){
		return instance;
	}
	@Override
	public MemberBean getMemberInfo(String id) {
		
		return DatailMemberDAO.getInstance().getMemberInfo(id);
	}
	
}
