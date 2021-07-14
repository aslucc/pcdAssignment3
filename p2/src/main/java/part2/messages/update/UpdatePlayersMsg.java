package part2.messages.update;

import akka.actor.ActorRef;
import part2.messages.UniqueIdMsg;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public final class UpdatePlayersMsg extends UniqueIdMsg {
	private static final long serialVersionUID = 1L;
	private final List<ActorRef> players;

	public UpdatePlayersMsg(final List<ActorRef> players){
		this.players = players;
	}
	
	public List<ActorRef> getPlayers(){
		return players;
	}
}
