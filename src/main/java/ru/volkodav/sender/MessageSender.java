package ru.volkodav.sender;

import java.util.Map;

public interface MessageSender {

    String send(Map<String, String> headers);
}
