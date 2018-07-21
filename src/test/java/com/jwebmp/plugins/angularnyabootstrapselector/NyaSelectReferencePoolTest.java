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

package com.jwebmp.plugins.angularnyabootstrapselector;

import com.jwebmp.core.Page;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class NyaSelectReferencePoolTest
{

	public NyaSelectReferencePoolTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		NyaSelect nya = new NyaSelect("test.me");
		nya.add(new NyaSelectItem().setText("Item 1")
		                           .setValue("value1")
		                           .setIconClass("fa-shopping")
		                           .setCheckClass("checking"));

		System.out.println(nya.toString(true));
	}

	@Test
	public void testPage()
	{
		Page p = new Page();
		p.getOptions()
		 .setDynamicRender(false);
		NyaSelect nya = new NyaSelect("test.me");
		p.getBody()
		 .add(nya);
		System.out.println(p.toString(true));
	}

}
