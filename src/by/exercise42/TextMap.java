package by.exercise42;

import by.common.exercise27.TransformText;
import java.util.HashMap;

public class TextMap {

    private HashMap<String,Integer> textMap;

    public TextMap(String text) {
        setTextMap(text);
    }

    private void setTextMap(String text) {
        TransformText transformText = new TransformText();
        String[] words = transformText.textToWordArray(text);
        textMap = new HashMap<>();

        // TODO: for (int i = 0; i < words.length; i++) words[i] = words[i].toLowerCase(); //  учитывать регистр

        for (String word : words) {
            if(textMap.get(word) == null) {
                textMap.put(word,1);
            } else {
                Integer value = textMap.get(word);
                textMap.put(word,++value);
            }
        }
    }

    public HashMap<String, Integer> getTextMap() {
        return textMap;
    }
}
