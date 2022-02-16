package kinoCMS.controllers;

import kinoCMS.database.DAO.UsersDAOJDBC;
import kinoCMS.service.TestUsersDataService;
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

//    private final IUsersCrudRepository usersCrudRepository;

    private final TestUsersDataService testUsersDataService;

    @Autowired
    public UsersController(UsersDAOJDBC usersDAOServiceJDBC, TestUsersDataService testUsersDataService){
        this.usersDAOServiceJDBC = usersDAOServiceJDBC;

//        this.usersCrudRepository = usersCrudRepository;
        this.testUsersDataService = testUsersDataService;
    }

    @GetMapping()
    public String returnAllUsers(Model model) throws SQLException {
        model.addAttribute("users", testUsersDataService.getAll());
        System.out.println(testUsersDataService.getAll());
        return "users";
    }



    @GetMapping("/{id}")
    public String returnUserByID(@PathVariable("id") int id, Model model) throws SQLException {
//        model.addAttribute("user", usersDAOServiceJDBC.selectUsersWhereID(id));
//        model.addAttribute("user", testUsersDataService.getAll());
        return "byID";
    }
}
