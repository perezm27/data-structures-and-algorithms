package utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void testMultiBracketValidation() {
        String str1 = "{}";
        String str2 = "{}(){}";
        String str3 = "()[[Extra Characters]]";
        String str4 = "(){}[[]]";
        String str5 = "{}{Code}[Fellows](())";

        String str6 = "[({}]";
        String str7 = "(](";
        String str8 = "{(})";

        assertEquals(true, MultiBracketValidation.multiBracketValidation(str1));
        assertEquals(true, MultiBracketValidation.multiBracketValidation(str2));
        assertEquals(true, MultiBracketValidation.multiBracketValidation(str3));
        assertEquals(true, MultiBracketValidation.multiBracketValidation(str4));
        assertEquals(true, MultiBracketValidation.multiBracketValidation(str5));

        assertEquals(false, MultiBracketValidation.multiBracketValidation(str6));
        assertEquals(false, MultiBracketValidation.multiBracketValidation(str7));
        assertEquals(false, MultiBracketValidation.multiBracketValidation(str8));





    }
}