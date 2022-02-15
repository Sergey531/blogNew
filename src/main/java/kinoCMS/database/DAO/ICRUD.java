package kinoCMS.database.DAO;

import java.sql.SQLException;
import java.util.List;

public interface ICRUD {
    List<Object> selectObject() throws SQLException, ClassNotFoundException;
    Object selectObjectWhereID(int id) throws SQLException, ClassNotFoundException;
    void addOrder(int first, String second) throws SQLException, ClassNotFoundException;
    void updateObject(int id, int first, String second) throws SQLException, ClassNotFoundException;
    void deleteObject(int id) throws SQLException, ClassNotFoundException;
}
