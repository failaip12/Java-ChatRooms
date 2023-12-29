package rs.raf.pds.v4.z5.messages;

import com.esotericsoftware.kryo.Kryo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

public class KryoUtil {
	public static void registerKryoClasses(Kryo kryo) {
		kryo.register(String.class);
		kryo.register(String[].class);
		kryo.register(Login.class);
		kryo.register(ChatMessage.class);
		kryo.register(FetchMessages.class);
		
		kryo.register(ChatMessageLinkedHashSet.class);
		kryo.register(List.class);
		kryo.register(ArrayList.class);
		kryo.register(LinkedHashSet.class);
		
		kryo.register(EditMessage.class);
		kryo.register(WhoRequest.class);
		kryo.register(ListUsers.class);
		kryo.register(InfoMessage.class);
		kryo.register(UpdatedChatMessage.class);
		kryo.register(UUID.class);
	}
}
