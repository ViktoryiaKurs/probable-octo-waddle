import org.w3c.dom.Node;

import java.util.*;

public class Word {
    private String obj;

    public void setObj(String obj) {
        this.obj = obj;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Word newObj = (Word) obj;
        return this.obj != null && this.obj.equals(newObj.obj);
    }


    @Override
    public int hashCode() {
        int result = (obj != null ? obj.hashCode() : 0);
        return 31 * result;
    }

    public void textToWordsMap(Map<Word, Integer> map) {
        String[] words = obj.split("[\\p{Punct}\\s]+");
        for (String word : words) {
            Word wordObj = new Word();
            wordObj.obj = word;
            if (map.containsKey(wordObj)) {
                map.replace(wordObj, map.get(wordObj) + 1);
                //map.put(wordObj, map.get(wordObj) + 1);
            } else {
                map.put(wordObj, 1);
            }
        }
    }

    public void getFiveMaxNodes(Map<Word, Integer> map) {
        Integer counterElements = 0;
        Integer maxValue;
        Word maxWord = new Word();
        Integer numNodesOfMap = 5;
        List<String> arrayListOfMaxNodes = new ArrayList<>();
        Set<Word> keySet = map.keySet();
        if (map.size() < 5) {
            numNodesOfMap = map.size();
        }
        while (counterElements != numNodesOfMap) {
            maxValue = 0;
            for (Word key : keySet) {
                if (maxValue < map.get(key) && !arrayListOfMaxNodes.contains(key.obj)) {
                    maxValue = map.get(key);
                    maxWord = key;
                }
            }
            arrayListOfMaxNodes.add(maxWord.obj);
            System.out.println(maxWord.obj);
            counterElements++;
        }

    }
}