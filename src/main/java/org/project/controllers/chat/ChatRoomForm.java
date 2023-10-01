package org.project.controllers.chat;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
//getter, 생성자 매개변수 , toString, equalsAndHashCode
public record ChatRoomForm(
        Long roomNo,
        @NotBlank String roomNm,
        int max) { }
