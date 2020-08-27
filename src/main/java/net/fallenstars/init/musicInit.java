package net.fallenstars.init;

import net.fallenstars.FallenStars;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;


public class musicInit {

    public static SoundEvent moonlightsonata;
    public static SoundEvent closetothesun;

    public static void registerSounds(){
        moonlightsonata=registerSound("moonlightsonata");
        closetothesun=registerSound("closetothesun");
    }
    private static SoundEvent registerSound(String soundName){
        final SoundEvent sound = new SoundEvent(new ResourceLocation(FallenStars.MODID, soundName)).setRegistryName(new ResourceLocation(FallenStars.MODID,soundName));
        ForgeRegistries.SOUND_EVENTS.register(sound);
        return sound;
    }
}
