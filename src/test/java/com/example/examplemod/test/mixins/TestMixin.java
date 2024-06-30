package com.example.examplemod.test.mixins;

import com.example.examplemod.test.TestInterface;
import net.minecraft.core.BlockPos;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BlockPos.class)
public class TestMixin implements TestInterface {
}
