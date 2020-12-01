import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

public class TestIOReadWrite {

    @Before
    public void setUp(){
        ROT13 crypt = new ROT13();

        crypt.encryptFile(new File("sonnet18.txt"));
        crypt.decryptFile(new File("sonnet18.enc"));

    }

    @Test
    public void fileWriterTest(){
        try{
            BufferedReader readerOfOriginal = new BufferedReader(new FileReader("sonnet18.txt"));
            BufferedReader readerOfDecripted = new BufferedReader(new FileReader("sonnet18.dec"));
            String originalLine;
            String decriptedLine;
            while(( readerOfOriginal.readLine()) != null && readerOfDecripted.readLine() != null){
                originalLine = readerOfOriginal.readLine();
                decriptedLine = readerOfDecripted.readLine();
                Assert.assertEquals(originalLine, decriptedLine);
            }
            readerOfOriginal.close();
            readerOfDecripted.close();
        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        {

       }
   }


}
