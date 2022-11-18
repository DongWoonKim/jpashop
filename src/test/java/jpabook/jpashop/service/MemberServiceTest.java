package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;

    @Test
    public void 회원가입() throws Exception {

        // given
        Member member = new Member();
        member.setName("홍길동");

        // when
        Long savedId = memberService.join(member);

        // then
        assertEquals( member, memberService.findOne(savedId) );

    }

    @Test
    public void 중복_회원_예외() throws Exception {

        // given
        Member member1 = new Member();
        member1.setName("kim");

        Member member2 = new Member();
        member2.setName("kim");

        // when
        memberService.join(member1);
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            memberService.join(member2);
        });

        // then
        String message = exception.getMessage();
        assertEquals("이미 존재하는 회원입니다.", message);

    }

}