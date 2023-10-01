package org.project.controllers.chat;

import lombok.Builder;

@Builder
//getter, 생성자 매개변수 , toString, equalsAndHashCode
public record ChatRoomForm(Long roomNo, String roomNm, int max) { }
