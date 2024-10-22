/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import restaurant.dbutil.DBconnection;
import restaurant.dto.UserDTO;

/**
 *
 * @author Chetabist
 */
public class UserDAO {     
    private static PreparedStatement ps;
    static
    {
        try
        {
            ps=DBconnection.getConnection().prepareStatement("select user_type from user_details where username=? and password=?");
            
        }
        catch(SQLException sqlex)
        {
            sqlex.printStackTrace();
        }
    }
    public static String validateUser(UserDTO user)throws SQLException
    {
        ps.setString(1,user.getUserid());
        ps.setString(2, user.getPassword());
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            return rs.getString(1);
        }
        return null;
    }
}
