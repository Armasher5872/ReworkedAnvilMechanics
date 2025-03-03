package net.phazoganon.reworkedanvil.mixin.ui;

import net.minecraft.client.gui.screens.inventory.AnvilScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(AnvilScreen.class)
public abstract class AnvilScreenMixin {
    @ModifyConstant(method = "renderLabels", constant = @Constant(intValue = 40))
    private int mixinLimitInt(int i) {
        return Integer.MAX_VALUE;
    }
}