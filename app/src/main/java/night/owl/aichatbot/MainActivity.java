package night.owl.aichatbot;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView chatRecyclerView;
    private ChatAdapter chatAdapter;
    private List<Message> messageList;
    private EditText inputMessage;
    private ImageView sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chatRecyclerView = findViewById(R.id.chat_recycler_view);
        inputMessage = findViewById(R.id.userInput);
        sendButton = findViewById(R.id.sendButton);

        messageList = new ArrayList<>();
        chatAdapter = new ChatAdapter(messageList);
        chatRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        chatRecyclerView.setAdapter(chatAdapter);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userMessage = inputMessage.getText().toString();
                if (!userMessage.isEmpty()) {
                    messageList.add(new Message(userMessage, true)); // User message
                    messageList.add(new Message(getBotResponse(userMessage), false)); // Bot response
                    chatAdapter.notifyDataSetChanged();
                    chatRecyclerView.smoothScrollToPosition(messageList.size() - 1);
                    inputMessage.setText("");
                }
            }
        });
    }

    private String getBotResponse(String query) {
        // Simple response logic (replace with your predefined responses)

        AIChatbot chatbot = new AIChatbot();


        return chatbot.getResponse(query);
    }
}
