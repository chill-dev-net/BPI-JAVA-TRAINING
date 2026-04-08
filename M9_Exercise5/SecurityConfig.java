package M9_Exercise5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(auth -> auth
				.requestMatchers("/public").permitAll()
				.requestMatchers("/home").hasAnyRole("USER", "MANAGER")
				.requestMatchers("/profile/**").hasAnyRole("USER", "MANAGER")
				.requestMatchers("/dashboard").hasRole("USER")
				.requestMatchers("/reports").hasRole("MANAGER")
				.anyRequest().authenticated()
		)
		.httpBasic(withDefaults());
		return http.build();
	}

	@Bean
	public UserDetailsService userDetailsService() {
 
	    UserDetails user = User.withUsername("dev_1")
	            .password(passwordEncoder().encode("dev_1"))
	            .roles("USER")
	            .build();
	    
	    UserDetails user2 = User.withUsername("dev_2")
	    		.password(passwordEncoder().encode("dev_2"))
	    		.roles("USER")
	    		.build();
 
	    UserDetails admin = User.withUsername("mgr_1")
	            .password(passwordEncoder().encode("mgr_1"))
	            .roles("MANAGER")
	            .build();
 
	    return new InMemoryUserDetailsManager(user, user2, admin);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
