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

public interface INyaSelect
{
	/**
	 * Sets this select option as multiple Binds as an array, make the dto object a List
	 *
	 * @param multiple
	 *
	 * @return
	 */
	NyaSelect setMultiple(boolean multiple);

	/**
	 * Provide a input box to search through all option content only if live-search="true"
	 *
	 * @param liveSearch
	 *
	 * @return
	 */
	NyaSelect setLiveSearch(boolean liveSearch);

	/**
	 * The control is considered valid if ngModel value is defined or not an empty array(for multiple)
	 *
	 * @param required
	 *
	 * @return
	 */
	NyaSelect setRequired(boolean required);

	/**
	 * if the expression is truthy, then the whole control will be disabled.
	 *
	 * @param expression
	 *
	 * @return
	 */
	NyaSelect setDisabled(String expression);

	/**
	 * Sets max number which the dropdown-menu can show. if the number of options exceed the limit. an scrollbar will be shown.
	 *
	 * @param displaysize
	 *
	 * @return
	 */
	NyaSelect setDisplaySize(Integer displaysize);

	/**
	 * provide a replacement for default text when nothing is selected.
	 *
	 * @param title
	 *
	 * @return
	 */
	NyaSelect setTitle(String title);

	/**
	 * Sets this select option as multiple Binds as an array, make the dto object a List
	 *
	 * @param actionsBox
	 *
	 * @return
	 */
	NyaSelect setActionsBox(boolean actionsBox);

	/**
	 * if sets to value, the dropdown-toggle button will show content user has selected, this is default value.
	 *
	 * @param selectedTextAsValue
	 *
	 * @return
	 */
	NyaSelect setSelectedTextValue(boolean selectedTextAsValue);

	/**
	 * if sets to count, the dropdown-toggle button will show the number of options user has selected.
	 *
	 * @param selectedTextAsCount
	 *
	 * @return
	 */
	NyaSelect setSelectedTextCount(boolean selectedTextAsCount);

	/**
	 * Show Menu Arrow
	 * <p>
	 * To enable an menu arrow on dropdown menu. just add a class show-menu-arrow on nya-bs-select element.
	 *
	 * @param showMenuIcon
	 *
	 * @return
	 */
	NyaSelect setShowMenuIcon(boolean showMenuIcon);

	/**
	 * if sets to count greater than x, the dropdown-toggle button will show the number of user selected options when the number of options greater than x. otherwise, show the
	 * content.
	 *
	 * @param selectedTextAsCount
	 * @param countThan
	 *
	 * @return
	 */
	NyaSelect setSelectedTextCountGreaterThan(boolean selectedTextAsCount, int countThan);
}
