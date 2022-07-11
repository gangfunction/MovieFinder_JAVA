package dao.admin;

import dto.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class adminMovieDelete {
    adminMovieDelete(){
        System.out.println("영화 삭제");
        System.out.println("삭제하실 영화의 제목을 입력하세요");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String sql = "delete from box_office where movie_name like '%" + title + "%'";
        try{
            Connection conn = dto.makeConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.executeUpdate();
            System.out.println("삭제가 완료되었습니다.");
            new AutoBReset();
    } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
