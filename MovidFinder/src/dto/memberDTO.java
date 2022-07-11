package dto;

public class memberDTO {
    public static String id;
    public static String pwd;
    private static boolean isin;
    private  static boolean admin;

    //getter and setter
    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        memberDTO.id = id;
    }

    public static String getPwd() {
        return pwd;
    }

    public static void setPwd(String pwd) {
        memberDTO.pwd = pwd;
    }

    public static boolean getIsin() {
        return isin;
    }
    public static void setIsin(boolean isin) {
        memberDTO.isin = isin;
    }

    public static boolean getAdmin() {
        return admin;
    }
    public static void setAdmin(boolean b) {
        memberDTO.admin=b;
    }

}
