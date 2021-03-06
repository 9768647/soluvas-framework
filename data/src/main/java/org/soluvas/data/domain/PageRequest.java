/*
 * Copyright 2008-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.soluvas.data.domain;

import java.io.Serializable;

import org.soluvas.data.domain.Sort.Direction;

/**
 * Basic Java Bean implementation of {@link Pageable}.
 * 
 * Adapted from Spring Data Commons 1.4.
 * 
 * @author Oliver Gierke
 * @see PageOffsetRequest
 */
public class PageRequest implements Pageable, Serializable {

	private static final long serialVersionUID = 8280485938848398236L;

	private final long page;
	private final long size;
	private final Sort sort;

	/**
	 * Creates a new {@link PageRequest}. Pages are zero indexed, thus providing 0 for {@code page} will return the first
	 * page.
	 * 
	 * @param size
	 * @param page
	 */
	public PageRequest(long page, long size) {

		this(page, size, null);
	}

	/**
	 * Creates a new {@link PageRequest} with sort parameters applied.
	 * 
	 * @param page
	 * @param size
	 * @param direction
	 * @param properties
	 */
	public PageRequest(long page, long size, Direction direction, String... properties) {

		this(page, size, new Sort(direction, properties));
	}

	/**
	 * Creates a new {@link PageRequest} with sort parameters applied.
	 * 
	 * @param page
	 * @param size
	 * @param sort
	 */
	public PageRequest(long page, long size, Sort sort) {

		if (0 > page) {
			throw new IllegalArgumentException("Page index must not be less than zero!");
		}

		if (0 >= size) {
			throw new IllegalArgumentException("Page size must not be less than or equal to zero!");
		}

		this.page = page;
		this.size = size;
		this.sort = sort;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.springframework.data.domain.Pageable#getPageSize()
	 */
	@Override
	public long getPageSize() {
		return size;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.springframework.data.domain.Pageable#getPageNumber()
	 */
	@Override
	public long getPageNumber() {
		return page;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.springframework.data.domain.Pageable#getFirstItem()
	 */
	@Override
	public long getOffset() {
		return page * size;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.springframework.data.domain.Pageable#getSort()
	 */
	@Override
	public Sort getSort() {
		return sort;
	}

	@Override
	public Pageable andSort(Sort tailSort) {
		final Sort newSort = sort != null ? sort.and(tailSort) : tailSort;
		return new PageRequest(page, size, newSort);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {

		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PageRequest)) {
			return false;
		}

		PageRequest that = (PageRequest) obj;

		boolean pageEqual = this.page == that.page;
		boolean sizeEqual = this.size == that.size;

		boolean sortEqual = this.sort == null ? that.sort == null : this.sort.equals(that.sort);

		return pageEqual && sizeEqual && sortEqual;
	}

	@Override
	public int hashCode() {

		int result = 17;

		result = (int) (31 * result + page);
		result = (int) (31 * result + size);
		result = 31 * result + (null == sort ? 0 : sort.hashCode());

		return result;
	}

	@Override
	public String toString() {
		return "PageRequest [page=" + page + ", size=" + size + ", "
				+ (sort != null ? "sort=" + sort : "") + "]";
	}

	@Override
	public boolean isCapped() {
		return false;
	}
}
