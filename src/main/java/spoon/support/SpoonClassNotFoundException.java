/*
 * SPDX-License-Identifier: (MIT OR CECILL-C)
 *
 * Copyright (C) 2006-2023 INRIA and contributors
 *
 * Spoon is available either under the terms of the MIT License (see LICENSE-MIT.txt) or the Cecill-C License (see LICENSE-CECILL-C.txt). You as the user are entitled to choose the terms under which to adopt Spoon.
 */
package spoon.support;

import spoon.SpoonException;

/** Spoon-specific ClassNotFoundException (mostly encapsulates a ClassNotFoundException or a NoClassDefFoundError
 * as a runtime exception)
 */
public class SpoonClassNotFoundException extends SpoonException {
	public SpoonClassNotFoundException(String msg, Throwable cnfe) {
		super(msg, cnfe);
	}

	private static final long serialVersionUID = 1L;

	public SpoonClassNotFoundException() {
	}

	public SpoonClassNotFoundException(String msg) {
		super(msg);
	}
}
