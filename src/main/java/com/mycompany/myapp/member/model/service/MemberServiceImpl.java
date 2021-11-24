package com.mycompany.myapp.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.member.model.dao.MemberDao;
import com.mycompany.myapp.member.model.vo.Member;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDao memberDao;
	
	@Override
	public int signUp(Member mvo) {
		return memberDao.signUp(mvo);
	}

}
