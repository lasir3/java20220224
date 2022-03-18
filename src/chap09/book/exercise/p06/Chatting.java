package chap09.book.exercise.p06;

public class Chatting {
	void startChat(String chatId) {
		String nickName /* = null */;// final, effectively final
		nickName = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();

	}

	class Chat {
		void start() {
		}

		void sendMessage(String message) {
		}
	}

}
