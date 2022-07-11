package dao.admin;

import dto.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class adminMemberDelete extends adminMemberList {
    protected adminMemberDelete() throws SQLException, ClassNotFoundException {
        try{
        new adminMemberList();
        System.out.println("삭제하실 회원의 아이디를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        Connection conn = dto.makeConnection();
        String sql = "delete from member where id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, id);
        stmt.executeUpdate();
        System.out.println("회원이 삭제되었습니다.");}
        catch(SQLException e){
            System.out.println("삭제할 회원이 없습니다.");
        }
        new AutoMReset();
        new adminMenu();
    }
}
