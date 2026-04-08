package M9_Exercise5;

import java.util.Collection;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@GetMapping("/home")
	public String publicPage() {
		return "Welcome to the portal";
	}

	@GetMapping("/dashboard")
	@PreAuthorize("hasRole('USER')")
	public String profilePage() {
		return "User dashboard";
	}
	
	@PreAuthorize("#username == authentication.name")
	@GetMapping("/profile/username/{username}")
	public String getProfileByUsername(@PathVariable String username) {
		return "Profile of " + username;
	}

	@GetMapping("/reports")
	@Secured("ADMIN")
	public String adminPage() {
		return "Manager reports";
	}

}
