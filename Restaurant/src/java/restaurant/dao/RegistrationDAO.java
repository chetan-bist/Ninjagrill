/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import restaurant.dbutil.DBconnection;
import restaurant.dto.UserDetails;

/**
 *
 * @author Chetabist
 */
public class RegistrationDAO {
      private static PreparedStatement ps,ps1;
    static
    {
        try
        {
            ps=DBconnection.getConnection().prepareStatement("select * from user_details where username=?");
            ps1=DBconnection.getConnection().prepareStatement("insert into user_details values(?,?,?,?,?,?)");
        }
        catch(SQLException sqlex)
        {
            sqlex.printStackTrace();
        }
    }
    public static boolean searchUser(String userid)throws SQLException
    {
        ps.setString(1, userid);
        return ps.executeQuery().next();
    }
    public static boolean regsterUser(UserDetails user)throws SQLException
    {
        ps1.setString(1, user.getUsername());
        ps1.setString(2, user.getUserid());
        ps1.setString(3, user.getEmail());
        ps1.setLong(4, user.getMobile());
        ps1.setString(5, user.getPassword());
        ps1.setString(6, "user");
        return ps1.executeUpdate()==1;
    }
}
