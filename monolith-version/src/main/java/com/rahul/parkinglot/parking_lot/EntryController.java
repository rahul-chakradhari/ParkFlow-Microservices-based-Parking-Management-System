<<<<<<< HEAD
package com.rahul.parkinglot.parking_lot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {
    @GetMapping("/")
    public String welcome(){
        return "Welcome to the Parking Lot!";
    }
}
=======
package com.rahul.parkinglot.parking_lot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {
    @GetMapping("/")
    public String welcome(){
        return "Welcome to the Parking Lot!";
    }
}
>>>>>>> 9780f22bce0d570e8526a7f6ef38dc2af128417f
