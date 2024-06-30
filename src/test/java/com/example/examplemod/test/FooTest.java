package com.example.examplemod.test;


import com.example.examplemod.MainInterface;
import net.minecraft.core.BlockPos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FooTest {
    @Test
    public void fooTest() {
        assertTrue(MainInterface.class.isAssignableFrom(BlockPos.class));
    }
    @Test
    public void barTest() {
        assertTrue(TestInterface.class.isAssignableFrom(BlockPos.class));
    }
}
