package night.owl.aichatbot;

import android.os.Bundle;
import android.util.Log;
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

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView chatRecyclerView;
    private ChatAdapter chatAdapter;
    private List<ChatMessage> messageList;
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
//                    messageList.add(new Message(userMessage, true)); // User message
//                    messageList.add(new Message(getBotResponse(userMessage), false)); // Bot response


                    addMessageToChat(new ChatMessage(userMessage, true));
                    callGeminiAPI(userMessage);

//                    chatAdapter.notifyDataSetChanged();
//                    chatRecyclerView.smoothScrollToPosition(messageList.size() - 1);
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




    public void callGeminiAPI(String query) {
        // Define the API key and endpoint
        String apiKey = "YOUR_API_KEY"; // Replace with your actual API key
        String url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent?key=";

        // Create the JSON payload
        String jsonPayload = "{\n" +
                "  \"contents\": [{\n" +
                "    \"parts\": [{\"text\": \"" + query + "\"}]\n" +
                "  }]\n" +
                "}";

        // Define the media type for JSON
        MediaType JSON = MediaType.get("application/json; charset=utf-8");

        // Create the request body
        RequestBody requestBody = RequestBody.create(jsonPayload, JSON);

        // Build the HTTP request
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .addHeader("Content-Type", "application/json")
                .build();

        // Execute the request in a separate thread
        OkHttpClient client = new OkHttpClient();
        new Thread(() -> {
            try {
                Response responseBody = client.newCall(request).execute();
//                if (response.isSuccessful()) {
//                    // Process the response
//
//
//                    String responseBody = response.body().string();
//
//                    runOnUiThread(() -> {
//                        Log.d("message", responseBody);
//                        // Update your UI with the response
//                        addMessageToChat(new ChatMessage(responseBody, false));
//                    });
//                }

                String response =  responseBody.body().string();


                JSONObject jsonObject = new JSONObject(response);

                // Navigate to the "text" field
                JSONArray candidatesArray = jsonObject.getJSONArray("candidates");
                if (candidatesArray.length() > 0) {
                    JSONObject firstCandidate = candidatesArray.getJSONObject(0);
                    JSONObject contentObject = firstCandidate.getJSONObject("content");
                    JSONArray partsArray = contentObject.getJSONArray("parts");
                    if (partsArray.length() > 0) {
                        JSONObject firstPart = partsArray.getJSONObject(0);
                        String text = firstPart.getString("text"); // Extracted "text" field

                        // Update the UI with the extracted text
                        runOnUiThread(() -> {
                            addMessageToChat(new ChatMessage(text, false));
                        });
                    }
                }


                else {
                    // Handle the error
                    runOnUiThread(() -> {
                        addMessageToChat(new ChatMessage("Error: " + response.toString(), false));
                    });
                }
            } catch (Exception e) {
                e.printStackTrace();
                runOnUiThread(() -> {
                    addMessageToChat(new ChatMessage("Request failed: " + e.getMessage(), false));
                });
            }
        }).start();
    }

    private void addMessageToChat(ChatMessage message) {
        messageList.add(message);
        chatAdapter.notifyItemInserted(messageList.size() - 1);
        chatRecyclerView.scrollToPosition(messageList.size() - 1);
    }

}
