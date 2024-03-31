package edu.tcu.cs.hogwartsartifactsonline.hogwartsuser;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<HogwartsUser, Integer> {

    Optional<HogwartsUser> findByUsername(String username);

    // List<HogwartsUser> findByEnabled(boolean enabled);
    // Optional<HogwartsUser> findByUsernameAndPassword(String username, String password);

}