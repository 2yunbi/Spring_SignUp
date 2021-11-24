package com.mycompany.myapp.member.model.vo;

public class Member {
//	MEMBER_ID VARCHAR2(30) PRIMARY KEY,
//	MEMBER_PWD VARCHAR2(100) NOT NULL,
//	MEMBER_NM VARCHAR2(15) NOT NULL,
//	MEMBER_ENROLL_DT DATE DEFAULT SYSDATE
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String memberEnrollDt;
	
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName
			+ ", memberEnrollDt=" + memberEnrollDt + "]";
	}
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberEnrollDt() {
		return memberEnrollDt;
	}
	public void setMemberEnrollDt(String memberEnrollDt) {
		this.memberEnrollDt = memberEnrollDt;
	}
	
}
