package com.sky.task;

import com.alibaba.fastjson.JSON;
import com.sky.websocket.WebSocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@Component
public class WebSocketTask {

    @Autowired
    private WebSocketServer webSocketServer;

    //5秒响一次。影响其他其他功能实现效果，关掉！
    //@Scheduled(cron = "0/5 * * * * ?")
    public void sendMessageToClient() {
        Map<String, Object> map = new HashMap<>();
        map.put("type", 1);
        map.put("orderId", null);
        map.put("content", "这是来自服务端的消息：" +
                DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now()));

        String json = JSON.toJSONString(map);
        webSocketServer.sendToAllClient(json);
    }
}