package night.owl.aichatbot;

public class Message {
    private String message;
    private boolean isUser; // true for user, false for bot

    public Message(String message, boolean isUser) {
        this.message = message;
        this.isUser = isUser;
    }

    public String getMessage() {
        return message;
    }

    public boolean isUser() {
        return isUser;
    }
}
