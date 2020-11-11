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

import com.jwebmp.core.base.html.*;
import com.jwebmp.plugins.bootstrap4.dropdown.options.BSDropDownOptions;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 04 Feb 2017
 */
public class NyaSelectItem
		extends ListItem
		implements NyaSelectChildren
{


	private String label;
	private String text;
	private String iconClass;
	private String value;
	private String checkClass;
	private String subText;

	public NyaSelectItem()
	{
	}

	public NyaSelectItem(String text, String iconClass, String value, String checkClass, String subText)
	{
		this.text = text;
		this.iconClass = iconClass;
		this.value = value;
		this.checkClass = checkClass;
		this.subText = subText;
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			addClass("nya-bs-option");
			addClass(BSDropDownOptions.Dropdown_Item);

			Link link = new Link();
			add(link);

			Span labelSpan = new Span();

			if (getIconClass() != null && !getIconClass().isEmpty())
			{
				Span iconSpan = new Span();
				iconSpan.addClass(getIconClass());
				labelSpan.add(iconSpan);
			}
			labelSpan.add(new Paragraph(getText()).setTextOnly(true));

			link.add(labelSpan);

			if (getSubText() != null && !getSubText().isEmpty())
			{
				labelSpan.add(new SmallText(getSubText()));
			}

			if (getValue() != null && !getValue().isEmpty())
			{
				addAttribute("data-value", getValue());
			}

			if (getCheckClass() != null && !getCheckClass().isEmpty())
			{
				Span iconSpan = new Span();
				iconSpan.addClass(getCheckClass());
				iconSpan.addClass("check-mark");
				link.add(iconSpan);
			}
		}
		super.preConfigure();
	}

	public String getIconClass()
	{
		return iconClass;
	}

	public String getSubText()
	{
		return subText;
	}

	public String getValue()
	{
		return value;
	}

	public NyaSelectItem setValue(String value)
	{
		this.value = value;
		return this;
	}

	public String getCheckClass()
	{
		return checkClass;
	}

	public NyaSelectItem setCheckClass(String checkClass)
	{
		this.checkClass = checkClass;
		return this;
	}

	public void setSubText(String subText)
	{
		this.subText = subText;
	}

	public NyaSelectItem setIconClass(String iconClass)
	{
		this.iconClass = iconClass;
		return this;
	}


	public String getLabel()
	{
		return label;
	}

	public NyaSelectItem setLabel(String label)
	{
		this.label = label;
		return this;
	}

	@Override
	public String getText()
	{
		return text;
	}

	@NotNull
	@Override
	public NyaSelectItem setText(String text)
	{
		this.text = text;
		return this;
	}

}
