import java.util.HashMap;
import java.util.Map;

public class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord;
    public void TrieNode(){
            children = new HashMap<>();
            endOfWord = false;

    }

      TrieNode root;
    public void Trie(){
        root = new TrieNode();

    }

    public void insert(String word){

        TrieNode current = root;
        for(int i = 0; i <  word.length();i++){
            char ch = word.charAt(i);

            TrieNode node = current.children.get(ch);
            if(node == null){
                node = new TrieNode();
                current.children.put(ch, node);

            }
            current = node;
        }
        current.endOfWord = true;
    }

public static void main(String S[]){

        TrieNode trie = new TrieNode();
        trie.insert("hello");
}

}
