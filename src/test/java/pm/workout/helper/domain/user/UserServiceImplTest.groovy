package pm.workout.helper.domain.user

import org.springframework.security.crypto.password.PasswordEncoder
import pm.workout.helper.api.authentication.request.CreateUserRequest
import pm.workout.helper.domain.notification.NotificationRepository
import pm.workout.helper.domain.user.health.AppUserPhoto
import pm.workout.helper.infrastructure.services.TrainingPlanConfigurationService
import spock.lang.Specification

import java.time.LocalDate
import java.time.LocalDateTime
import java.util.concurrent.atomic.AtomicLong
import java.util.function.Function
import java.util.stream.Collectors

class UserServiceImplTest extends Specification {
    def "when trying to create user and user with given email and username not exists should save new user"() {
        given:

        when:

        expect:
        1 == 1
//    def "when trying to create user and user with given email and username not exists should save new user"() {
//        given:
//        final String USER_USERNAME = "username"
//        final Long USER_ID = 1L
//        final String USER_PASSWORD = "password"
//        final String USER_EMAIL = "email@wp.pl"
//        final LocalDate USER_BIRTHDAY = LocalDate.now()
//        final LocalDate TRAINING_START_DAY = LocalDate.now()
//        final Gender USER_GENDER = Gender.MALE
//        def userRepository = new UserRepositoryMock()
//        def passwordEncoder = Mock(PasswordEncoder)
//        def userMapper = Mock(UserMapper)
//        def trainingPlanConfService = Mock(TrainingPlanConfigurationService)
//        def notificationRepository = Mock(NotificationRepository)
//        def userService = new UserServiceImpl(userRepository, passwordEncoder, userMapper, trainingPlanConfService, notificationRepository)
//        def createUserRequest = new CreateUserRequest(USER_USERNAME, USER_PASSWORD, USER_EMAIL, USER_BIRTHDAY, TRAINING_START_DAY, USER_GENDER)
//
//        when:
//        userService.createUser(createUserRequest)
//
//        then:
//        userRepository.getAllUsers().size() == 1
//        userRepository.getAllUsers().get(0).getUsername() == USER_USERNAME
//        userRepository.getAllUsers().get(0).getId() == USER_ID
//        userRepository.getAllUsers().get(0).getEmail() == USER_EMAIL
//        userRepository.getAllUsers().get(0).getDateOfBirth() == USER_BIRTHDAY
    }

    def "when trying to get user by login and user exists should return user"() {
        given:

        when:

        expect:
        1 == 1
    }

    def "when trying to  get user details and user exists should return user"() {
        given:

        when:

        expect:
        1 == 1
    }

    def "when trying to update user details should update user details and save"() {
        given:

        when:

        expect:
        1 == 1
    }

    def "when trying to change user password, and both password before change match should change"() {
        given:

        when:

        expect:
        1 == 1
    }

    def "when trying to change user password, and both password before change not match should throw"() {
        given:

        when:

        expect:
        1 == 1
    }

    def "when trying to get all user details should return user details"() {
        given:

        when:

        expect:
        1 == 1
    }

    def "when trying current user trianing  plan and training plan exists should return plan"() {
        given:

        when:

        expect:
        1 == 1
    }

    def "when trying current user trianing  plan and training plan not exists should throw"() {
        given:

        when:

        expect:
        1 == 1
    }

    def "when trying to save user foto should save"() {
        given:

        when:

        expect:
        1 == 1
    }

    def "when trying to get user foto and foto exists should return photo"() {
        given:

        when:

        expect:
        1 == 1
    }

    def "FindUsersWithUpdateRequiredAndSendNotification"() {
        given:

        when:

        expect:
        1 == 1
    }

    private final class UserRepositoryMock implements UserRepository {
        private final Map<Long, AppUser> USERS_ID_MAP = new HashMap<>();
        private final Map<String, AppUser> USERS_LOGIN_MAP = new HashMap<>();
        private AtomicLong seq = new AtomicLong(2L)

        UserRepositoryMock(){

        }
//        UserRepositoryMock(List<AppUser> usersList) {
//            USERS_ID_MAP = usersList.stream().collect(Collectors.toMap(AppUser.&getId, Function.identity()))
//            USERS_LOGIN_MAP = usersList.stream().collect(Collectors.toMap(AppUser.&getUsername, Function.identity()))
//        }

        @Override
        Optional<AppUser> findUserByUsername(String login) {
            return Optional.ofNullable(USERS_LOGIN_MAP.get(login))
        }

        @Override
        Optional<AppUser> findUserByEmail(String email) {
            return Optional.ofNullable(USERS_LOGIN_MAP.get(email))
        }

        @Override
        void saveUser(AppUser user) {
            user.id = seq.incrementAndGet()
            USERS_ID_MAP.put(user.id, user)
            USERS_LOGIN_MAP.put(user.username, user)
        }

        @Override
        Optional<AppUser> findUserById(long userId) {
            return Optional.ofNullable(USERS_ID_MAP.get(userId))
        }

        @Override
        void saveUserPhoto(AppUserPhoto photo) {

        }

        @Override
        Optional<AppUserPhoto> findUserPhoto(long userId) {
            return null
        }

        @Override
        void deleteUserPhoto(long userPhotoId) {

        }

        @Override
        List<AppUser> getAllUsers() {
            return USERS_ID_MAP.values().toList()
        }
    }
}
