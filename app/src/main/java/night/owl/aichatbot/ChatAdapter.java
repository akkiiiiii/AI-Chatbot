package night.owl.aichatbot;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int USER_MESSAGE = 1;
    private static final int BOT_MESSAGE = 2;

    private List<Message> messageList;

    public ChatAdapter(List<Message> messageList) {
        this.messageList = messageList;
    }

    @Override
    public int getItemViewType(int position) {
        return messageList.get(position).isUser() ? USER_MESSAGE : BOT_MESSAGE;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == USER_MESSAGE) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_user_message, parent, false);
            return new UserMessageViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_bot_message, parent, false);
            return new BotMessageViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Message message = messageList.get(position);
        if (holder instanceof UserMessageViewHolder) {
            ((UserMessageViewHolder) holder).userMessage.setText(message.getMessage());
        } else if (holder instanceof BotMessageViewHolder) {
            ((BotMessageViewHolder) holder).botMessage.setText(message.getMessage());
        }
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }

    static class UserMessageViewHolder extends RecyclerView.ViewHolder {
        TextView userMessage;

        public UserMessageViewHolder(@NonNull View itemView) {
            super(itemView);
            userMessage = itemView.findViewById(R.id.user_message);
        }
    }

    static class BotMessageViewHolder extends RecyclerView.ViewHolder {
        TextView botMessage;

        public BotMessageViewHolder(@NonNull View itemView) {
            super(itemView);
            botMessage = itemView.findViewById(R.id.bot_message);
        }
    }
}

