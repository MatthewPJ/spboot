package com.cargosmart.spboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpbootApplicationTests {

    @Test
    public void contextLoads() {
        assertThat(Boolean.TRUE).isTrue();
    }

}
