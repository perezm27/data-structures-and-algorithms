package LeftJoin;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void testLeftJoinEmpty() {
        HashMap synonyms = new HashMap();
        HashMap antonyms = new HashMap();

        ArrayList expected = new ArrayList();

        assertEquals(expected, LeftJoin.leftJoin(synonyms, antonyms));
    }

    @Test
    public void testLeftJoin() {
        HashMap synonyms = new HashMap();
        HashMap antonyms = new HashMap();

        synonyms.put("fond", "enamored");
        synonyms.put("wrath", "anger");
        synonyms.put("diligent", "employed");
        synonyms.put("outfit", "garb");
        synonyms.put("guide", "usher");

        antonyms.put("fond", "averse");
        antonyms.put("wrath", "delight");
        antonyms.put("diligent", "idle");
        antonyms.put("guide", "follow");
        antonyms.put("flow", "jam");

        ArrayList expected = new ArrayList();
        expected.add("diligent");
        expected.add("employed");
        expected.add("idle");
        expected.add("outfit");
        expected.add("garb");
        expected.add(null);
        expected.add("wrath");
        expected.add("anger");
        expected.add("delight");
        expected.add("guide");
        expected.add("usher");
        expected.add("follow");
        expected.add("fond");
        expected.add("enamored");
        expected.add("averse");


        assertEquals(expected, LeftJoin.leftJoin(synonyms, antonyms));
    }

    @Test
    public void testLeftJoinSame() {
        HashMap synonyms = new HashMap();
        HashMap antonyms = new HashMap();

        synonyms.put("fond", "enamored");
        synonyms.put("wrath", "anger");
        synonyms.put("diligent", "employed");
        synonyms.put("outfit", "garb");
        synonyms.put("guide", "usher");

        antonyms.put("fond", "averse");
        antonyms.put("wrath", "delight");
        antonyms.put("diligent", "idle");
        antonyms.put("guide", "follow");
        antonyms.put("flow", "jam");

        ArrayList expected = new ArrayList();
        expected.add("diligent");
        expected.add("employed");
        expected.add("idle");
        expected.add("outfit");
        expected.add("garb");
        expected.add(null);
        expected.add("wrath");
        expected.add("anger");
        expected.add("delight");
        expected.add("guide");
        expected.add("usher");
        expected.add("follow");
        expected.add("fond");
        expected.add("enamored");
        expected.add("averse");


        assertEquals(expected, LeftJoin.leftJoin(synonyms, antonyms));
    }
}