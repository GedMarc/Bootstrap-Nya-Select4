/*
 * Copyright (C) 2017 Marc Magon
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
package za.co.mmagon.jwebswing.angularnyabootstrapselector;

import za.co.mmagon.jwebswing.base.angular.AngularAttributes;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.base.html.List;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.BSFormChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.BSFormGroupChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.sets.BSFormSetChildren;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * An implementation of
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 17 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Nya Select", description = "An Bootstrap dropdown component and replacement of vanilla select element, designed for AngularJS ",
		url = "http://nya.io/nya-bootstrap-select/#!/", wikiUrl = "https://github.com/GedMarc/JWebSwing-BSNyaSelect/wiki")
public class NyaSelect extends List<NyaSelectChildren, NyaSelectAttributes, NyaSelectEvents, NyaSelect> implements BSFormChildren, BSFormGroupChildren, BSFormSetChildren, INyaSelect
{

	private static final long serialVersionUID = 1L;

	private static final String SelectedTextAttributeText = "selected-text-format";

	/**
	 * Constructs a new instance
	 * <p>
	 */
	public NyaSelect()
	{
		this("data.nya");
	}

	/**
	 * Constructs a new instance
	 *
	 * @param bindingVariableName
	 */
	public NyaSelect(String bindingVariableName)
	{
		super(true);
		addClass("nya-bs-select");
		addAttribute(AngularAttributes.ngModel, bindingVariableName);
		JQueryPageConfigurator.setRequired(true);
		AngularPageConfigurator.setRequired(true);
	}

	/**
	 * Returns a trimmed structure for nya select
	 * @return
	 */
	public INyaSelect asMe()
	{
		return this;
	}

	@Override
	public NyaSelect setMultiple(boolean multiple)
	{
		if (multiple)
		{
			addAttribute("multiple", null);
		}
		else
		{
			getAttributes().remove("multiple");
		}
		return this;
	}

	@Override
	public NyaSelect setLiveSearch(boolean liveSearch)
	{
		if (liveSearch)
		{
			addAttribute("live-search", Boolean.TRUE.toString());
		}
		else
		{
			getAttributes().remove("live-search");
		}
		return this;
	}

	@Override
	public NyaSelect setRequired(boolean required)
	{
		if (required)
		{
			addAttribute("required", Boolean.TRUE.toString());
		}
		else
		{
			getAttributes().remove("required");
		}
		return this;
	}

	@Override
	public NyaSelect setDisabled(String expression)
	{
		if (expression != null && !expression.isEmpty())
		{
			addAttribute("disabled", expression);
		}
		else
		{
			getAttributes().remove("disabled");
		}
		return this;
	}

	@Override
	public NyaSelect setDisplaySize(Integer displaysize)
	{
		if (displaysize != null && displaysize != 0)
		{
			addAttribute("size", displaysize.toString());
		}
		else
		{
			getAttributes().remove("size");
		}
		return this;
	}

	@Override
	public NyaSelect setTitle(String title)
	{
		if (title != null && !title.isEmpty())
		{
			addAttribute("title", title);
		}
		else
		{
			getAttributes().remove("title");
		}
		return this;
	}

	@Override
	public NyaSelect setActionsBox(boolean actionsBox)
	{
		if (actionsBox)
		{
			addAttribute("actions-box", "true");
		}
		else
		{
			getAttributes().remove("actions-box");
		}
		return this;
	}

	@Override
	public NyaSelect setSelectedTextValue(boolean selectedTextAsValue)
	{
		if (selectedTextAsValue)
		{
			addAttribute(SelectedTextAttributeText, "value");
		}
		else
		{
			getAttributes().remove(SelectedTextAttributeText);
		}
		return this;
	}

	@Override
	public NyaSelect setSelectedTextCount(boolean selectedTextAsCount)
	{
		if (selectedTextAsCount)
		{
			addAttribute(SelectedTextAttributeText, "count");
		}
		else
		{
			getAttributes().remove(SelectedTextAttributeText);
		}
		return this;
	}

	@Override
	public NyaSelect setShowMenuIcon(boolean showMenuIcon)
	{
		if (showMenuIcon)
		{
			addClass("show-menu-arrow");
		}
		else
		{
			removeClass("show-menu-arrow");
		}
		return this;
	}

	@Override
	public NyaSelect setSelectedTextCountGreaterThan(boolean selectedTextAsCount, int countThan)
	{
		if (selectedTextAsCount)
		{
			addAttribute(SelectedTextAttributeText, "count>" + countThan);
		}
		else
		{
			getAttributes().remove(SelectedTextAttributeText);
		}
		return this;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode()
	{
		int hash = 7;
		hash = 79 * hash + (this.getID().hashCode());
		return hash;
	}

}
