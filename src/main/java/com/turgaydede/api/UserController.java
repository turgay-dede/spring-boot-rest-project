package com.turgaydede.api;

import com.turgaydede.business.UserManager;
import com.turgaydede.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserManager userManager;

    public UserController(UserManager userManager) {
        this.userManager = userManager;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody User user) {
        this.userManager.add(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/delete")
    public ResponseEntity<?> delete(@RequestParam int userId) {
        this.userManager.delete(userId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/update")
    public ResponseEntity<?> update(@RequestBody User user) {
        this.userManager.update(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getall")
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok().body(this.userManager.getAll());
    }
}
