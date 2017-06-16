package com.member.model;

import java.sql.Timestamp;

public class MemberService {

	private MemberDAO_interface dao;
	
	public MemberService(){
		dao = new MemberDAO();
	}
	
	public MemberVO insert(String memno,String memname,String sex,Timestamp birth,String mail,String phone,String addr,String acc,String pwd,byte[] idcard1,byte[] idcard2,byte[] license,Timestamp credate){
		MemberVO memberVO = new MemberVO();
		
		memberVO.setMemno(memno);
		memberVO.setMemname(memname);
		memberVO.setSex(sex);
		memberVO.setBirth(birth);
		memberVO.setMail(mail);
		memberVO.setPhone(phone);
		memberVO.setAddr(addr);
		memberVO.setAcc(acc);
		memberVO.setPwd(pwd);
		memberVO.setIdcard1(idcard1);
		memberVO.setIdcard2(idcard2);
		memberVO.setLicense(license);
		return memberVO;
	}
	
	public MemberVO update(String memno,String memname,String sex,Timestamp birth,String mail,String phone,String addr,String acc,String pwd,byte[] idcard1,byte[] idcard2,byte[] license,Timestamp credate){
		MemberVO memberVO = new MemberVO();
		
		memberVO.setMemno(memno);
		memberVO.setMemname(memname);
		memberVO.setSex(sex);
		memberVO.setBirth(birth);
		memberVO.setMail(mail);
		memberVO.setPhone(phone);
		memberVO.setAddr(addr);
		memberVO.setAcc(acc);
		memberVO.setPwd(pwd);
		memberVO.setIdcard1(idcard1);
		memberVO.setIdcard2(idcard2);
		memberVO.setLicense(license);
		return memberVO;
	}
}
