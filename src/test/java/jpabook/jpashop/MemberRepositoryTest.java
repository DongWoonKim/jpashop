package jpabook.jpashop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
 */
class MemberRepositoryTest {
    /*
    @Autowired MemberRepository memberRepository;

    @Test
    @Transactional
//    @Rollback(value = false)
    public void testMember() {

        // given
        Member member = new Member();
        member.setUsername("memberA");

        // when
        Long saveId = memberRepository.save(member);
        Member findMember = memberRepository.find(saveId);

        // then
        assertEquals(member.getId(), findMember.getId());
        assertEquals(member.getUsername() ,findMember.getUsername());
        assertEquals(findMember, member);

    }
     */

}