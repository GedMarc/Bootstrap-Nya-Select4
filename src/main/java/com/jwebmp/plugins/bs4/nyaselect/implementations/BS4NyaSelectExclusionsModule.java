package com.jwebmp.plugins.bs4.nyaselect.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class BS4NyaSelectExclusionsModule
		implements IGuiceScanModuleExclusions<BS4NyaSelectExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angularnyabootstrap4selector");
		return strings;
	}
}
