/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.engine.bridge.mapping;

import java.lang.annotation.Annotation;

/**
 * @author Yoann Rodiere
 */
public final class ImmutableBridgeDefinition<A extends Annotation> implements BridgeDefinition<A> {

	private final A annotation;

	public ImmutableBridgeDefinition(A annotation) {
		super();
		this.annotation = annotation;
	}

	@Override
	public A get() {
		return annotation;
	}

}