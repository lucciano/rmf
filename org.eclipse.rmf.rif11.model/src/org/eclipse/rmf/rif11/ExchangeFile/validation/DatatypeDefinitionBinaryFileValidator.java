/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.rif11.ExchangeFile.validation;


/**
 * A sample validator interface for {@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DatatypeDefinitionBinaryFileValidator {
	boolean validate();

	boolean validateApplication(String value);
	boolean validateFilenameSuffix(String value);
	boolean validateFormatName(String value);
	boolean validateMimeType(String value);
}
