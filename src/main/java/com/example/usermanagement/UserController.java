package com.example.usermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    // 1. Show the Registration Page
    @GetMapping("/register")
    public String showRegistrationPage(Model model) {
        model.addAttribute("user", new User());
        return "register"; // This looks for register.html in templates folder
    }

    // 2. Handle the Registration Form Submission
    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.registerUser(user);
        return "redirect:/login"; // Redirect to login after saving
    }

    // 3. Show the Login Page
    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // This looks for login.html
    }

    // 4. Handle Login Logic
    @PostMapping("/loginUser")
    public String loginUser(@RequestParam String email, @RequestParam String password, Model model) {
        User user = userService.login(email, password);
        if (user != null) {
            model.addAttribute("users", userService.getAllUsers());
            return "dashboard"; // Go to dashboard if login successful
        }
        model.addAttribute("error", "Invalid Email or Password");
        return "login";
    }

    // 5. Delete User Action
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "redirect:/login"; // Go back to refresh list
    }
    
    // 6. Show the Edit Page (Pre-filled with user data)
    @GetMapping("/edit/{id}")
    public String showEditPage(@PathVariable Long id, Model model) {
        User user = userService.getUserById(id);
        if (user != null) {
            model.addAttribute("user", user); // This puts the user's data into the form
            return "register"; // We reuse the register.html page for editing!
        }
        return "redirect:/login";
    }


}
