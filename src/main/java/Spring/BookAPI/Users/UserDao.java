package Spring.BookAPI.Users;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {

    User CreateNewUser(UUID id, String username, String email, String password);

    default User CreateNewUser(String username, String email, String password) {
        UUID id = UUID.randomUUID();
        return CreateNewUser(id, username, email, password);
    }

    List<User> selectAllUsers();

    User updateUserById(UUID id, User user);

    Optional<User> selectUserById(UUID id);

}
