/*
 * =============================================================================
 * Copyright by Benjamin Sempere,
 * All rights reserved.
 * =============================================================================
 * Author  : Benjamin Sempere
 * E-mail  : benjamin@sempere.org
 * Homepage: www.sempere.org
 * =============================================================================
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.sempere.commons;

import org.sempere.commons.print.PrintableObject;

/**
 * Generic class that represents a Pair of Objects.
 * 
 * @author bsempere
 */
public class Pair<K, V> extends PrintableObject {

	private K pair1;
	private V pair2;

	// *************************************************************************
	//
	// Constructors
	//
	// *************************************************************************

	public Pair(K pair1, V pair2) {
		this.pair1 = pair1;
		this.pair2 = pair2;
	}

	// *************************************************************************
	//
	// Getters and Setters
	//
	// *************************************************************************

	public K getPair1() {
		return pair1;
	}

	public void setPair1(K pair1) {
		this.pair1 = pair1;
	}

	public V getPair2() {
		return pair2;
	}

	public void setPair2(V pair2) {
		this.pair2 = pair2;
	}
}
