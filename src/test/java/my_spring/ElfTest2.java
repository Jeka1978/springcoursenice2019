package my_spring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ElfTest2 {

    @Test
    public void getDoubleSpeed() {
        Elf elf = new Elf();
        elf.setSpeed(10);
        int asnswer = elf.getDoubleSpeed();
        Assert.assertEquals(20,asnswer);
    }
}