package net.mcreator.lucas.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.lucas.init.LucasModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements LucasModBiomes.LucasModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> lucas_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.lucas_dimensionTypeReference != null) {
			retval = LucasModBiomes.adaptSurfaceRule(retval, this.lucas_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setlucasDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.lucas_dimensionTypeReference = dimensionType;
	}
}