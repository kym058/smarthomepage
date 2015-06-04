package com.smarthomepage.join;

public class MemberServiceImpl implements MemberService{
	private MemberServiceImpl() {}
	private static MemberServiceImpl instance = new MemberServiceImpl();
	public static MemberServiceImpl getInstance(){
		return instance;
	}
	@Override
	public int joinMember(MemberBean bean) {
		/*
		 * 싱글톤 패턴 : 다수의 인스턴스를 생성하면 메모리 점유율이 높아져서
		 * 	속도가 느려지거나 프로그램이 멈추는 현상이 생긴다.
		 *  그걸 방지하기 위해 단 하나의 인스턴스를 만들기 위해 
		 *  싱글톤 패턴을 사용한다.
		 * */
		return MemberDAO.getInstance().insertMember(bean);
	}

}
