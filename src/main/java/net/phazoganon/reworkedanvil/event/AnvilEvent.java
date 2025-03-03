package net.phazoganon.reworkedanvil.event;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.AnvilUpdateEvent;
import net.neoforged.neoforge.event.entity.player.AnvilRepairEvent;
import net.phazoganon.reworkedanvil.ReworkedAnvil;

@EventBusSubscriber(modid = ReworkedAnvil.MODID, bus = EventBusSubscriber.Bus.GAME, value = Dist.CLIENT)
public class AnvilEvent {
    @SubscribeEvent
    public static void onAnvilRepair(AnvilRepairEvent event) {
        event.setBreakChance(0.0F);
    }
}