package net.phazoganon.reworkedanvil.mixin.ui;

import net.minecraft.world.inventory.AnvilMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AnvilMenu.class)
public class AnvilMenuMixin {
    @ModifyConstant(method = "createResult", constant = @Constant(intValue = 40))
    private int mixinLimitInt(int i) {
        return Integer.MAX_VALUE;
    }
    @ModifyConstant(method = "createResult", constant = @Constant(intValue = 39))
    private int mixinMaxInt(int i) {
        return Integer.MAX_VALUE - 1;
    }
    @Inject(method = "calculateIncreasedRepairCost", at = @At(value = "RETURN"), cancellable = true)
    private static void calculateIncreasedRepairCost(int oldRepairCost, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(oldRepairCost);
    }
}