package vn.tayjava;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

@Disabled
@SpringBootTest(classes = vn.tayjava.TayJavaApplication.class)
@Profile("test")
class TayJavaApplicationTests {

	@Test
	void contextLoads() {
	}

}
