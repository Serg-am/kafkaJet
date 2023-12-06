package com.jet.common.processor;

import com.jet.common.messages.Message;

public interface MessageProcessor<T extends Message> {

    void process(String jsonMessage);
}
