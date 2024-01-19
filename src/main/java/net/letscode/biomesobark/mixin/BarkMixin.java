package net.letscode.biomesobark.mixin;

import net.letscode.treebark.item.BarkReference;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.HashMap;
import java.util.List;

@Mixin(net.letscode.treebark.registries.BarkRegistry.class)
public class BarkMixin {

    @Shadow public static List<BarkReference> references;

    private static final String MOD_ID = "biomesoplenty";
    @Inject(method = "register", at = @At(value = "TAIL"), remap = false)
    private static void register(CallbackInfo ci) {
        HashMap<ResourceLocation, ResourceLocation> FIR_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        FIR_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_fir_log"), new ResourceLocation(MOD_ID, "fir_log"));
        FIR_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_fir_wood"), new ResourceLocation(MOD_ID, "fir_wood"));
        references.add(new BarkReference(FIR_BLOCKS, "fir_bark"));

        HashMap<ResourceLocation, ResourceLocation> REDWOOD_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        REDWOOD_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_redwood_log"), new ResourceLocation(MOD_ID, "redwood_log"));
        REDWOOD_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_redwood_wood"), new ResourceLocation(MOD_ID, "redwood_wood"));
        references.add(new BarkReference(REDWOOD_BLOCKS, "redwood_bark"));

        HashMap<ResourceLocation, ResourceLocation> CHERRY_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        CHERRY_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_cherry_log"), new ResourceLocation(MOD_ID, "cherry_log"));
        CHERRY_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_cherry_wood"), new ResourceLocation(MOD_ID, "cherry_wood"));
        references.add(new BarkReference(CHERRY_BLOCKS, "cherry_bark"));

        HashMap<ResourceLocation, ResourceLocation> MAHOGANY_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        MAHOGANY_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_mahogany_log"), new ResourceLocation(MOD_ID, "mahogany_log"));
        MAHOGANY_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_mahogany_wood"), new ResourceLocation(MOD_ID, "mahogany_wood"));
        references.add(new BarkReference(MAHOGANY_BLOCKS, "mahogany_bark"));

        HashMap<ResourceLocation, ResourceLocation> JACARANDA_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        JACARANDA_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_jacaranda_log"), new ResourceLocation(MOD_ID, "jacaranda_log"));
        JACARANDA_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_jacaranda_wood"), new ResourceLocation(MOD_ID, "jacaranda_wood"));
        references.add(new BarkReference(JACARANDA_BLOCKS, "jacaranda_bark"));

        HashMap<ResourceLocation, ResourceLocation> PALM_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        PALM_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_palm_log"), new ResourceLocation(MOD_ID, "palm_log"));
        PALM_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_palm_wood"), new ResourceLocation(MOD_ID, "palm_wood"));
        references.add(new BarkReference(PALM_BLOCKS, "palm_bark"));

        HashMap<ResourceLocation, ResourceLocation> WILLOW_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        WILLOW_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_willow_log"), new ResourceLocation(MOD_ID, "willow_log"));
        WILLOW_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_willow_wood"), new ResourceLocation(MOD_ID, "willow_wood"));
        references.add(new BarkReference(WILLOW_BLOCKS, "willow_bark"));

        HashMap<ResourceLocation, ResourceLocation> DEAD_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        DEAD_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_dead_log"), new ResourceLocation(MOD_ID, "dead_log"));
        DEAD_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_dead_wood"), new ResourceLocation(MOD_ID, "dead_wood"));
        references.add(new BarkReference(DEAD_BLOCKS, "dead_bark"));

        HashMap<ResourceLocation, ResourceLocation> MAGIC_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        MAGIC_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_magic_log"), new ResourceLocation(MOD_ID, "magic_log"));
        MAGIC_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_magic_wood"), new ResourceLocation(MOD_ID, "magic_wood"));
        references.add(new BarkReference(MAGIC_BLOCKS, "magic_bark"));

        HashMap<ResourceLocation, ResourceLocation> UMBRAN_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        UMBRAN_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_umbran_log"), new ResourceLocation(MOD_ID, "umbran_log"));
        UMBRAN_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_umbran_wood"), new ResourceLocation(MOD_ID, "umbran_wood"));
        references.add(new BarkReference(UMBRAN_BLOCKS, "umbran_bark"));

        HashMap<ResourceLocation, ResourceLocation> HELLBARK_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        HELLBARK_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_hellbark_log"), new ResourceLocation(MOD_ID, "hellbark_log"));
        HELLBARK_BLOCKS.put(new ResourceLocation(MOD_ID, "stripped_hellbark_wood"), new ResourceLocation(MOD_ID, "hellbark_wood"));
        references.add(new BarkReference(HELLBARK_BLOCKS, "hellbark_bark"));

    }
}
