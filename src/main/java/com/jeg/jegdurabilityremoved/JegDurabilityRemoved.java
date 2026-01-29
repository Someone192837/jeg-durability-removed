package com.jeg.jegdurabilityremoved;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("jegdurabilityremoved")
public class JegDurabilityRemoved {

    public JegDurabilityRemoved() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onItemBreak(PlayerDestroyItemEvent event) {
        ItemStack stack = event.getOriginal();

        if (stack != null &&
            stack.getItem().getClass().getName().toLowerCase().contains("jeg")) {
            stack.setDamageValue(0);
        }
    }
}
