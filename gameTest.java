import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    @InjectMocks
    private Game game;



    @Mock
    Scanner scanner;


    @Test
    public void when_writeQuit_then_exitGame() {
        when(scanner.nextLine()).thenReturn("Quit");


        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        game.play();

        Assert.assertTrue(out.toString().contains("Let's play Rock"));


    }
}
