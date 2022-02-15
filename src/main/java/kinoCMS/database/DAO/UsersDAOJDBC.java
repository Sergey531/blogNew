package kinoCMS.database.DAO;

import kinoCMS.database.logic.JDBCConnection;
import kinoCMS.database.models.UsersEntity;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

@Component
public class UsersDAOJDBC extends JDBCConnection {

    Connection connection = getConnection();

    public ArrayList<UsersEntity> selectUsers() throws SQLException {
        ArrayList<UsersEntity> list = new ArrayList<>();
        //UsersEntity user = new UsersEntity();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from kinocms.users ");
        while (resultSet.next()){
            UsersEntity userNew = new UsersEntity();

            userNew.setId(resultSet.getInt(1));
            userNew.setName(resultSet.getString(2));
            userNew.setSurname(resultSet.getString(3));
            userNew.setNickname(resultSet.getString(4));
            userNew.setEmail(resultSet.getString(5));
            userNew.setAdress(resultSet.getString(6));
            userNew.setPassword(resultSet.getString(7));
            userNew.setCardNumber(resultSet.getInt(8));
            userNew.setLanguage(resultSet.getString(9));
            userNew.setGender(resultSet.getString(10));
            userNew.setPhone(resultSet.getString(11));
            userNew.setBirthDate(resultSet.getTimestamp(12));
            userNew.setCity(resultSet.getString(13));
            userNew.setRepeatPassword(resultSet.getString(14));

            list.add(userNew);
        }
        return list;
    }

    public UsersEntity selectUsersWhereID(int id) throws SQLException {
        UsersEntity user = new UsersEntity();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from kinocms.users WHERE id='"+id+"'");
        while (resultSet.next()){
            //UsersEntity userNew = new UsersEntity();

            user.setId(resultSet.getInt(1));
            user.setName(resultSet.getString(2));
            user.setSurname(resultSet.getString(3));
            user.setNickname(resultSet.getString(4));
            user.setEmail(resultSet.getString(5));
            user.setAdress(resultSet.getString(6));
            user.setPassword(resultSet.getString(7));
            user.setCardNumber(resultSet.getInt(8));
            user.setLanguage(resultSet.getString(9));
            user.setGender(resultSet.getString(10));
            user.setPhone(resultSet.getString(11));
            user.setBirthDate(resultSet.getTimestamp(12));
            user.setCity(resultSet.getString(13));
            user.setRepeatPassword(resultSet.getString(14));

        }
        return user;
    }


    public void addUser(String name, String surname, String nickname, String Email, String adress, String password, int cardNumber, String language, String gender, String phone, String city, String repeatPassword) throws ClassNotFoundException, SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate("insert into kinocms.users (name, surname, nickname, Email, adress, password, cardNumber, language, gender, phone, birthDate, city, repeatPassword) values ('"+name+"', '"+surname+"', '"+nickname+"', '"+Email+"', '"+adress+"', '"+password+"', '"+cardNumber+"', '"+language+"', '"+gender+"', '"+phone+"', NOW(), '"+city+"', '"+repeatPassword+"')");
    }

}
