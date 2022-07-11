package dao.reviewPage;

import dto.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class reviewDelete{
    protected reviewDelete() throws SQLException, ClassNotFoundException {
        System.out.println("영화리뷰 삭제");
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제하실 리뷰의 번호를 입력하세요");
        int num = sc.nextInt();
        Connection conn = dto.makeConnection();
        String sql = "delete from review where num = ?";
        PreparedStatement stmt;
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, num);
            stmt.executeUpdate();
            System.out.println("삭제 완료");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
