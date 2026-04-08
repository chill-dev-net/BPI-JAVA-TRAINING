package M9_Exercise4;

import java.util.Collection;
import java.util.List;

import org.springframework.context.annotation.Scope;
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
	public String profilePage() {
		return "User dashboard";
	}

	@GetMapping("/reports")
	public String adminPage() {
		return "Manager reports";
	}

}
