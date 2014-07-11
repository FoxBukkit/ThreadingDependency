/**
 * This file is part of ThreadingDependency.
 *
 * ThreadingDependency is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ThreadingDependency is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with ThreadingDependency.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.foxelbox.dependencies.threading;

public interface IThreadCreator {
	public Thread createThread(Runnable r);
}
