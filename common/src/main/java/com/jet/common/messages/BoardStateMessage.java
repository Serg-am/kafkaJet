package com.jet.common.messages;

import com.jet.common.bean.Board;
import com.jet.common.bean.Source;
import com.jet.common.bean.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardStateMessage extends Message{
    private Board board;

    public BoardStateMessage() {
        this.source = Source.BOARD;
        this.type = Type.STATE;
    }

    public BoardStateMessage(Board val) {
        this();
        this.board = val;
    }
}
