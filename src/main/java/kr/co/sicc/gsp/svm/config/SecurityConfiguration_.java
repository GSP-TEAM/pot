package kr.co.sicc.gsp.svm.config;
//package kr.co.sicc.gsp.svm.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
//
////	@Autowired
//////	CustomUserDetailsService customUserDetailsService;
////
//	@Override
//	public void configure(WebSecurity web) throws Exception
//	{
//		web.ignoring()
//				.antMatchers("/css/**", "/script/**", "image/**", "/fonts/**", "lib/**");
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception
//	{
//		http.csrf().disable().authorizeRequests()
//		.antMatchers("/**").hasRole("ADMIN")
//		.antMatchers("/**").hpermitAll()
//		.and()
//        .formLogin()
//            .
//		.loginPage("/login")
//		.loginProcessingUrl("/login")
//		.defaultSuccessUrl("/test")
//    	.failureUrl("/login")
//    	.and()
//    	.logout();
//
//
//		//http.csrf().disable().authorizeRequests().antMatchers("/regUser", "regUserPage").permitAll()
//		// To do : role ?��?�� �? ?���? 경로 �?�?
//			//.antMatchers("/admin/**").hasRole("ADMIN")
//		//.antMatchers("/**").hasRole("ADMIN")
//			//.antMatchers("/**").permitAll();
//	}

//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new Sha();
//	}
//
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication()
//				.withUser("user")
//				.password("1234");
//
//		//auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
//	}
//
//}