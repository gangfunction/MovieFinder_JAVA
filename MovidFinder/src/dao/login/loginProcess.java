package dao.login;

import dao.admin.adminMain;
import dto.memberDTO;
import service.serviceMenu;

import java.sql.SQLException;


public class loginProcess {
    //로그인 처리 db
    protected loginProcess() throws SQLException, ClassNotFoundException {
        new loginInput();
        new adCheck();
        new loginCheck();
        memberDTO.setIsin(true);
        if (memberDTO.getAdmin()) {
            System.out.println("관리자 로그인 성공");
            new loginUpdate();
            new loginSave();
            adminMain.main();
        }
        else
        {
            System.out.println("일반 회원 로그인");
            new serviceMenu();
        }
    }

}// 로그인 처리



