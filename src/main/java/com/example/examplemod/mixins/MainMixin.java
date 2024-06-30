package com.example.examplemod.mixins;

import com.example.examplemod.MainInterface;
import net.minecraft.core.BlockPos;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BlockPos.class)
public class MainMixin implements MainInterface {
}
