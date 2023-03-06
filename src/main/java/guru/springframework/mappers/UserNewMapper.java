package guru.springframework.mappers;

import guru.springframework.domain.UserNew;
import guru.springframework.model.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;



@Mapper
public interface UserNewMapper {

    UserNewMapper INSTANCE = Mappers.getMapper(UserNewMapper.class);

    UserDTO userNewToUserDTO(UserNew userNew);
    UserNew userDTOToUserNew(UserDTO userDTO);
}
