package com.syslp3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class Syslp3ApplicationTests {

	@Autowired
	PasswordEncoder passwordEncoder;
	@Test
	void contextLoads() {
		System.out.println(passwordEncoder.encode("1234"));
		//System.out.println(pdao2.validarUsuario("dreyna"));
	}		

}
