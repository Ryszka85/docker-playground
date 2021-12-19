package at.ra85.dockerplayground;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @GetMapping
    UserEntity by(@PathVariable String username) {
        return userRepository.findByName(username);
    }

    @GetMapping(value = "/all")
    List<UserEntity> getAll() { return userRepository.findAll(); }

    @PostMapping
    UserEntity from(@RequestBody UserDTO userDTO) {
        return userRepository.save(
                UserEntity.builder()
                        .name(userDTO.getUsername())
                        .build()
        );
    }

}
