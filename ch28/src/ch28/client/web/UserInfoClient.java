package ch28.client.web;

import ch28.domain.dao.UserInfoDao;
import ch28.domain.dao.myasql.UserInfoMySqlDao;
import ch28.domain.dao.oracle.UserInfoOracleDao;
import ch28.domain.userinfo.UserInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");
        System.out.println(dbType);

        UserInfo userInfo = new UserInfo();

        userInfo.setUserId("user01");
        userInfo.setPasswd("!@#$%^&");
        userInfo.setUserName("James");

        UserInfoDao userInfoDao = null;

        if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        } else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        } else {
            System.out.println("not supported");
        }

        if (userInfoDao != null) {
            userInfoDao.insertUserInfo(userInfo);
            userInfoDao.updateUserInfo(userInfo);
            userInfoDao.deleteUserInfo(userInfo);
        }
    }
}
