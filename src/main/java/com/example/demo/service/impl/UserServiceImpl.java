@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repo;

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    public User registerUser(User user) {
        return repo.save(user);
    }

    public User findByEmail(String email) {
        return repo.findByEmail(email).orElseThrow();
    }
}
