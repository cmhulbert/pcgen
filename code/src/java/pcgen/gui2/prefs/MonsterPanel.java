/*
 * MonsterPanel.java
 * Copyright 2008 (C) James Dempsey
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * Created on 20/07/2008 13:23:43
 *
 * $Id: $
 */
package pcgen.gui2.prefs;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import pcgen.core.SettingsHandler;
import pcgen.gui2.tools.Utility;
import pcgen.system.LanguageBundle;

/**
 * The Class <code>MonsterPanel</code> is responsible for 
 * displaying monster related preferences and allowing the 
 * preferences to be edited by the user.
 * 
 * Last Editor: $Author: $
 * Last Edited: $Date:  $
 * 
 * @author James Dempsey &lt;jdempsey@users.sourceforge.net&gt;
 */
@SuppressWarnings("serial")
public class MonsterPanel extends PCGenPrefsPanel
{
	private static String in_monsters =
		LanguageBundle.getString("in_Prefs_monsters");
//	private JCheckBox hideMonsterClasses = new JCheckBox();
	private JCheckBox ignoreMonsterHDCap = new JCheckBox();

	/**
	 * Instantiates a new monster panel.
	 */
	public MonsterPanel()
	{
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		JLabel label;
		Border etched = null;
		TitledBorder title1 =
				BorderFactory.createTitledBorder(etched, in_monsters);

		title1.setTitleJustification(TitledBorder.LEFT);
		this.setBorder(title1);
		gridbag = new GridBagLayout();
		this.setLayout(gridbag);
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.NORTHWEST;
		c.insets = new Insets(2, 2, 2, 2);

//		Utility.buildConstraints(c, 0, 0, 2, 1, 0, 0);
//		label =
//				new JLabel(LanguageBundle
//					.getString("in_Prefs_defaultMonsters")
//					+ ": ");
//		gridbag.setConstraints(label, c);
//		this.add(label);
//		Utility.buildConstraints(c, 2, 0, 1, 1, 0, 0);

//		Utility.buildConstraints(c, 0, 1, 2, 1, 0, 0);
//		label =
//				new JLabel(LanguageBundle
//					.getString("in_Prefs_hideMonsterClasses")
//					+ ": ");
//		gridbag.setConstraints(label, c);
//		this.add(label);
//		Utility.buildConstraints(c, 2, 1, 1, 1, 0, 0);
//		gridbag.setConstraints(hideMonsterClasses, c);
//		this.add(hideMonsterClasses);

		Utility.buildConstraints(c, 0, 2, 2, 1, 0, 0);
		ignoreMonsterHDCap.setText(LanguageBundle
					.getString("in_Prefs_ignoreMonsterHDCap"));
		this.add(ignoreMonsterHDCap, c);

		Utility.buildConstraints(c, 5, 20, 1, 1, 1, 1);
		c.fill = GridBagConstraints.BOTH;
		label = new JLabel(" ");
		gridbag.setConstraints(label, c);
		this.add(label);
	}

	/* (non-Javadoc)
	 * @see pcgen.gui2.prefs.PCGenPrefsPanel#getTitle()
	 */
	@Override
	public String getTitle()
	{
		return in_monsters;
	}
	
	/* (non-Javadoc)
	 * @see pcgen.gui2.prefs.PreferencesPanel#applyPreferences()
	 */
	@Override
	public void setOptionsBasedOnControls()
	{
//		SettingsHandler.setHideMonsterClasses(hideMonsterClasses.isSelected());
		SettingsHandler.setIgnoreMonsterHDCap(ignoreMonsterHDCap.isSelected());
	}

	/* (non-Javadoc)
	 * @see pcgen.gui2.prefs.PreferencesPanel#initPreferences()
	 */
	@Override
	public void applyOptionValuesToControls()
	{
//		hideMonsterClasses.setSelected(SettingsHandler.hideMonsterClasses());
		ignoreMonsterHDCap.setSelected(SettingsHandler.isIgnoreMonsterHDCap());
	}

}
