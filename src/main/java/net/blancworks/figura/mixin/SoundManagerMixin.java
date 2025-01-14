package net.blancworks.figura.mixin;

import net.blancworks.figura.access.SoundManagerAccess;
import net.minecraft.client.sound.SoundManager;
import net.minecraft.client.sound.SoundSystem;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(SoundManager.class)
public class SoundManagerMixin implements SoundManagerAccess {
    @Shadow @Final private SoundSystem soundSystem;

    @Override
    public SoundSystem getSoundSystem() {
        return this.soundSystem;
    }
}
