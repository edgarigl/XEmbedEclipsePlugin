/**
 * XEmbed Eclipse Plugin
 * Copyright (c) 2019 GreenSocs
 * 
 * Authors:
 *   Clement Deschamps <clement.deschamps@greensocs.com>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA
 */

package com.greensocs.xembed.parts;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class XEmbedView {

	public static long XID = 0;

	@PostConstruct
	public void createPartControl(Composite parent) {
		final Composite composite = new Composite(parent, SWT.EMBEDDED);

		System.out.format("[XEmbedView] X window ID: %d (0x%x)\n", composite.embeddedHandle, composite.embeddedHandle);

		XID = composite.embeddedHandle;
	}

	@Focus
	public void setFocus() {
	}

}
