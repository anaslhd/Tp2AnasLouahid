package ma.emsi.AnasLouahid;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;
import dev.langchain4j.model.input.Prompt;
import dev.langchain4j.model.input.PromptTemplate;

import java.time.Duration;
import java.util.Map;

//main pour le deuxieme test
public class Main2 {
    public static void main(String[] args) {
        String key=System.getenv("Gemini_Key");
        ChatLanguageModel model = GoogleAiGeminiChatModel.builder().apiKey(key)
                .modelName("gemini-1.5-flash").temperature(0.5).timeout(Duration.ofSeconds(60)).build();
        Prompt prompt = PromptTemplate.from("traduit le mot {{mot}} en {{langue}}?").apply(Map.of("mot","bonjour","langue","allemand"));
      String  reponse = model.generate(prompt.text());
        System.out.println(reponse);

    }
}
