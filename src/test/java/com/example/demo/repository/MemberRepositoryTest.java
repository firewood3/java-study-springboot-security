package com.example.demo.repository;

import com.example.demo.model.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void test() {
        Optional<Member> hsj = memberRepository.findByUsername("hsj");
        System.out.println(hsj.get().toString());
        System.out.println("tt");
    }
}
