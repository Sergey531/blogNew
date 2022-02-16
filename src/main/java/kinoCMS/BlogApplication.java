package kinoCMS;

import kinoCMS.service.TestUsersDataService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import java.sql.SQLException;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan({"kinoCMS.database.DAO"})
public class BlogApplication {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		SpringApplication.run(BlogApplication.class, args);


	}

}
