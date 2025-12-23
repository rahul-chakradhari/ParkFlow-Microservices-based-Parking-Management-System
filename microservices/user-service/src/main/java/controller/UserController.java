package controller;

import data_transfer_object.EntryRequest;
import data_transfer_object.EntryResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/entry")
    public EntryResponse entry(@RequestBody EntryRequest entryRequest){
        return userService.processEntry(entryRequest);
    }
}
