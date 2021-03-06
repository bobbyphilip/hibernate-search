/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.util.impl.integrationtest.common.stub;

import org.hibernate.search.engine.backend.mapping.spi.BackendMappingContext;
import org.hibernate.search.engine.backend.session.spi.BackendSessionContext;

public class StubBackendSessionContext implements BackendSessionContext {

	private final StubBackendMappingContext mappingContext;
	private final String tenantIdentifier;

	public StubBackendSessionContext() {
		this( new StubBackendMappingContext(), null );
	}

	public StubBackendSessionContext(String tenantIdentifier) {
		this( new StubBackendMappingContext(), tenantIdentifier );
	}

	public StubBackendSessionContext(StubBackendMappingContext mappingContext, String tenantIdentifier) {
		this.mappingContext = mappingContext;
		this.tenantIdentifier = tenantIdentifier;
	}

	@Override
	public BackendMappingContext getMappingContext() {
		return mappingContext;
	}

	@Override
	public String getTenantIdentifier() {
		return tenantIdentifier;
	}
}
