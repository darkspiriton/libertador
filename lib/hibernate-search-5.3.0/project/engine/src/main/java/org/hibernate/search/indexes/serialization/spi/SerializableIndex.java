/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.indexes.serialization.spi;

/**
 * @author Emmanuel Bernard <emmanuel@hibernate.org>
 */
public enum SerializableIndex {
	NO,
	ANALYZED,
	NOT_ANALYZED,
	NOT_ANALYZED_NO_NORMS,
	ANALYZED_NO_NORMS
}
