package kinoCMS.controllers;

import kinoCMS.database.repository.IUsersCrudRepository;
import kinoCMS.database.DAO.UsersDAOJDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
@RequestMapping("/users")
public class UsersController {

    private final UsersDAOJDBC usersDAOServiceJDBC;

    private final IUsersCrudRepository usersCrudRepository;

    @Autowired
    public UsersController(UsersDAOJDBC usersDAOServiceJDBC, IUsersCrudRepository usersCrudRepository){
        this.usersDAOServiceJDBC = usersDAOServiceJDBC;
        this.usersCrudRepository = usersCrudRepository;
    }

    @GetMapping()
    public String returnAllUsers(Model model) throws SQLException {
        model.addAttribute("users", usersDAOServiceJDBC.selectUsers());
        return "users";
    }



    @GetMapping("/{id}")
    public String returnUserByID(@PathVariable("id") int id, Model model) throws SQLException {
        model.addAttribute("user", usersDAOServiceJDBC.selectUsersWhereID(id));
        return "byID";
    }
}
