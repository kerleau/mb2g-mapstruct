package guru.springframework.mappers2;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import guru.springframework.domain.User;
import guru.springframework.model.UserCommand;

@Mapper
public interface UserMapper2 {

    UserMapper2 INSTANCE = Mappers.getMapper(UserMapper2.class);

    UserCommand userToUserCommand(User user);

    User userCommandToUser(UserCommand userCommand);
    
}
