package com.jwebmp.plugins.angularnyabootstrapselector.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class BSNyaSelect4ExclusionsModule
		implements IGuiceScanModuleExclusions<BSNyaSelect4ExclusionsModule>,
				           IGuiceScanJarExclusions<BSNyaSelect4ExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-bootstrap-nya-select4-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angularnyabootstrap4selector");
		return strings;
	}
}
