/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.bs4.nyaselect;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 22 Feb 2017
 */
@PluginInformation(pluginName = "Nya Bootstrap 4 Select",
		pluginUniqueName = "bootstrap-nya-select4",
		pluginDescription = "nya-bootstrap-select helps you build select element or dropdown with Bootstrap style and an angular way. Generate options with collection, get user select value with model. Define various styles of the select options as you wish. ",
		pluginVersion = "BS3.3.7 / 4a6",
		pluginDependancyUniqueIDs = "jquery,bootstrap,angular",
		pluginCategories = "bootstrap,web ui,ui,framework,select,nya,bootstrap4",
		pluginSubtitle = "An Bootstrap dropdown component and replacement of vanilla select element, designed for AngularJS",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-BSNyaSelect",
		pluginSourceUrl = "https://github.com/lordfriend/nya-bootstrap-select",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-BSNyaSelect4/wiki",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.bootstrap/jwebmp-bootstrap-nya-select",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2017/03/04",
		pluginOriginalHomepage = "http://nya.io/nya-bootstrap-select/#!/",
		pluginGroupId = "com.jwebmp.plugins.bootstrap",
		pluginArtifactId = "jwebmp-bootstrap-nya-select",
		pluginModuleName = "com.jwebmp.plugins.bs4.nyaselect",
		pluginStatus = PluginStatus.Released
)
public class NyaSelectPageConfigurator
		implements IPageConfigurator<NyaSelectPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	public NyaSelectPageConfigurator()
	{
		//No config required
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return NyaSelectPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		NyaSelectPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	@SuppressWarnings("unchecked")
	 public Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			page.getBody()
			    .getJavascriptReferences()
			    .add(NyaSelectReferencePool.NyaReference.getJavaScriptReference());
			page.getBody()
			    .getCssReferences()
			    .add(NyaSelectReferencePool.NyaReference.getCssReference());

		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return NyaSelectPageConfigurator.enabled;
	}

	@Override
	public Integer sortOrder()
	{
		return 160;
	}
}
