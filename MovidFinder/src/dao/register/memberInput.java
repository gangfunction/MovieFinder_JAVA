package dao.register;

import dao.member.idCheck;
import dto.memberDTO;

import java.util.Scanner;

import static dto.memberDTO.id;

public class memberInput {
    memberInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("회원가입");
        System.out.println("아이디 입력");
        memberDTO.setId(sc.nextLine()) ;
        idCheck.action(id);
        System.out.println("비밀번호 입력");
        memberDTO.setPwd(sc.nextLine());
    }
}
