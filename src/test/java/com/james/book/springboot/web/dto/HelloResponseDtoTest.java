package com.james.book.springboot.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);  //  1,2
        assertThat(dto.getAmount()).isEqualTo(amount);

        // 안되면  gradle 다운그레이드 해야될 수도 있음  >>명령어 alt + f12 >> gradlew wrapper --gradle-version 4.10.2
    }
}
