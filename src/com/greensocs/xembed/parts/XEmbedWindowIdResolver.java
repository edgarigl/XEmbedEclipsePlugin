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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.variables.IDynamicVariable;
import org.eclipse.core.variables.IDynamicVariableResolver;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

public class XEmbedWindowIdResolver implements IDynamicVariableResolver {

	@Override
	public String resolveValue(IDynamicVariable arg0, String arg1) throws CoreException {
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					/* close current view */
					for (IViewReference view : page.getViewReferences()) {
						if (view.getTitle().contentEquals("XEmbed View")) {
							page.hideView(view);
						}
					}
					/* open a new view in order to generate a new XID */
					page.showView("com.greensocs.xembed.parts.XEmbedView");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		return String.format("%x",XEmbedView.XID);
	}

}
