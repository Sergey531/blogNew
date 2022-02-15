package kinoCMS.service;

import kinoCMS.database.models.UsersEntity;
import kinoCMS.database.repository.IUsersCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TestUsersDataService {

    @Autowired
    private IUsersCrudRepository usersCrudRepository;

    @Transactional
    public List<UsersEntity> getAll(){
        return usersCrudRepository.findAll();
//        Optional<UsersEntity> usersOptional = usersCrudRepository.save();
//        Optional<UsersEntity> usersOptional = usersCrudRepository.findById(1);

//        System.out.println(usersOptional);

    }


}
