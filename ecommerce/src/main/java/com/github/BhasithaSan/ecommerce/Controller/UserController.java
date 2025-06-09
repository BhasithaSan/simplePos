package com.github.BhasithaSan.ecommerce.Controller;


import com.github.BhasithaSan.ecommerce.Model.User.Users;
import com.github.BhasithaSan.ecommerce.Service.JwtService;
import com.github.BhasithaSan.ecommerce.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    private JwtService jwtService;


    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Users user){

        System.out.println("in controller"+ user.getUsername());

        String status=userService.register(user);

        if(status.equals("success")){
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(user);


        } else if (status.equals("exist")) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body("user already exist");

        }else if (status.equals("error")) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred during registration");
        } else {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Invalid registration status");
        }

    }
    @PostMapping("/login")
    public String login(@RequestBody Users user){

        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        if(authentication.isAuthenticated())
            return jwtService.generateToken(user.getUsername());
        else
            return "Login Failed";

    }



}
