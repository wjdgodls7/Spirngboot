package com.icia.member.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icia.member.domain.entity.MemberEntity;
//뼈대, 상수만 가져감, 클래스 생성 x, 추상 메서드만 구현 가능, 만능 리모콘           pk의 타입
public interface MemberRepository extends JpaRepository<MemberEntity, Integer>{
	
	// 이메일로 DB에서 해당 내용 조회
	MemberEntity findByMemail(String email);
}
