package dao.rescan;

import dto.memberDTO;
import service.serviceMenu;

import java.sql.SQLException;


public class resCanProcess {
    public resCanProcess() throws SQLException, ClassNotFoundException {
        if(memberDTO.getIsin()){
            new resShow();
            new resCanSeat();
            new seatCancelUpdate();
            new moviePointer();
            new serviceMenu();
        }
    }
}
