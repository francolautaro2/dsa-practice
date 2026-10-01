package dsa.ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    @Test
    void searchAndPrefix() {
        Trie t = new Trie();
        t.insert("apple");
        assertTrue(t.search("apple"));
        assertFalse(t.search("app"));
        assertTrue(t.startsWith("app"));
        t.insert("app");
        assertTrue(t.search("app"));
    }

    @Test
    void missingWords() {
        Trie t = new Trie();
        t.insert("car");
        assertFalse(t.search("cart"));
        assertFalse(t.startsWith("b"));
        assertFalse(t.search("ca"));
    }

    @Test
    void emptyPrefixMatchesWhenNotEmpty() {
        Trie t = new Trie();
        t.insert("a");
        assertTrue(t.startsWith(""));
    }
}
