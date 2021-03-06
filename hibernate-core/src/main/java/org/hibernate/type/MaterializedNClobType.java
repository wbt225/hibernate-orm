/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.type;

import org.hibernate.type.descriptor.java.StringTypeDescriptor;
import org.hibernate.type.descriptor.sql.NClobTypeDescriptor;

/**
 * A type that maps between {@link java.sql.Types#CLOB CLOB} and {@link String}
 *
 * @author Gavin King
 * @author Gail Badner
 * @author Steve Ebersole
 */
public class MaterializedNClobType extends AbstractSingleColumnStandardBasicType<String> {
	public static final MaterializedNClobType INSTANCE = new MaterializedNClobType();

	public MaterializedNClobType() {
		super( NClobTypeDescriptor.DEFAULT, StringTypeDescriptor.INSTANCE );
	}

	public String getName() {
		return "materialized_nclob";
	}
}
