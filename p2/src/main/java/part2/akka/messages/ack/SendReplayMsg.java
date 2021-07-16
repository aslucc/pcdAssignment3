package part2.akka.messages.ack;

import part2.akka.messages.UniqueIdMsg;

import java.io.Serializable;


public final class SendReplayMsg implements Serializable {
    private static final long serialVersionUID = 4L;
    private final UniqueIdMsg replayMsg;

    public SendReplayMsg(UniqueIdMsg replayMsg){
        this.replayMsg = replayMsg;
    }

    public UniqueIdMsg getReplayMsg(){
        return replayMsg;
    }
}