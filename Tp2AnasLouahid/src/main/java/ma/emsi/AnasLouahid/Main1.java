package ma.emsi.AnasLouahid;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.chat.request.ResponseFormat;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;

import java.time.Duration;

public class Main1 {
    public static void main(String[] args) {
        String key=System.getenv("Gemini_Key");
        ChatLanguageModel model = GoogleAiGeminiChatModel.builder().apiKey(key)
                .modelName("gemini-1.5-flash").temperature(0.5).timeout(Duration.ofSeconds(60))
        .responseFormat(ResponseFormat.JSON).build();
        String reponse = model.generate("Valeur euro en dirhams ?");
        System.out.println(reponse);

    }
}