package com.jwebmp.plugins.bs4.nyaselect.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class BS4NyaSelectInclusionModule implements IGuiceScanModuleInclusions<BS4NyaSelectInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.bs4.nyaselect");
		return set;
	}
}
