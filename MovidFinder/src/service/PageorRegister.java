package service;

import dao.myPage.myPage;
import dao.register.regProcess;
import dto.memberDTO;

import java.sql.SQLException;

public class PageorRegister {
    public PageorRegister() throws SQLException, ClassNotFoundException {
        if(memberDTO.getIsin()){
            new myPage();
        }
        else{
            new regProcess();
        }
        new serviceMenu();
    }
}
