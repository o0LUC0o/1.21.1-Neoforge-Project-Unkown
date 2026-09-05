package net.oOLUCOo.projectunknown.event;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ComputeFovModifierEvent;
import net.oOLUCOo.projectunknown.Items.ModItems;
import net.oOLUCOo.projectunknown.ProjectUnknown;

@EventBusSubscriber(modid = ProjectUnknown.MODID, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void onComputeFovModifierEvent(ComputeFovModifierEvent event) {
        if (event.getPlayer().isUsingItem() && event.getPlayer().getUseItem().getItem() == ModItems.OSMIUM_BOW.get()) {

            float ticksUsingItem = (float) event.getPlayer().getTicksUsingItem() + event.getPlayer().getTicksUsingItem();
            float deltaTicks = ticksUsingItem / 20.0f;

            if (deltaTicks > 1.0f) {
                deltaTicks = 1.0f;
            } else {
                deltaTicks *= deltaTicks;
            }


            float fovModifier = event.getFovModifier() * (1.0f - deltaTicks * 0.15f);

            event.setNewFovModifier(fovModifier);
        }
    }
}