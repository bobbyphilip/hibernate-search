/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.engine.backend.work.execution.spi;

import java.util.concurrent.CompletableFuture;

/**
 * An indexer scoped to a single index.
 *
 * @param <D> The expected document type.
 */
public interface IndexIndexer<D> {

	CompletableFuture<?> add(DocumentReferenceProvider documentReferenceProvider, DocumentContributor<D> documentContributor);

}
