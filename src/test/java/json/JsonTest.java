package json;

import org.junit.Assert;
import org.junit.Test;

public class JsonTest {

    @Test
    public void testCriandoJson(){
        ManipulandoJson manipulandoJson = new ManipulandoJson();
        String valor = manipulandoJson.criandoJson();
        Assert.assertEquals("Nome diferente","Elaine", valor);
    }
}
