package dao.myPage;

import dto.dto;
import dto.memberDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class memberEdit  {
    public memberEdit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("비밀번호 변경파트입니다.");
        System.out.println("변경하실 비밀번호를 입력해주세요.");
        String pwd = sc.nextLine();
        String sql = "update member set pwd = ?  where id = ?";
        try{
            Connection conn = dto.makeConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, pwd);
            stmt.setString(2, memberDTO.getId());
            stmt.executeUpdate();}
        catch(SQLException | ClassNotFoundException e){
                throw new RuntimeException(e);
            }
        System.out.println("비밀번호 변경이 완료되었습니다.");
    }
}
