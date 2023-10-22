package org.project.configs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@Component
public class ChatHandler extends TextWebSocketHandler {

    private static List<WebSocketSession> sessions = new ArrayList<>();
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception { //웹소켓에 접속했을때 사용
        sessions.add(session);
        log.info(session.toString() + " 접속");
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception { //사용자가 보낸 메세지
        String msg = message.getPayload();
        log.info("message : " + msg);
        for (WebSocketSession s : sessions) {
            s.sendMessage(message);
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception { //웹소켓에 접속을 종료했을때 사용
        log.info(session.toString() + " 해제");
        sessions.remove(session);
    }


}
