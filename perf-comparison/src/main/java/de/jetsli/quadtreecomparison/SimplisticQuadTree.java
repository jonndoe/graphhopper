/*
 *  Copyright 2012 Peter Karich info@jetsli.de
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package de.jetsli.quadtreecomparison;

/**
 *
 * @author Peter Karich
 */
interface SimplisticQuadTree {

    void put(double lat, double lon);

    int countNodes(double lat, double lon, double radiusInKm);

    int size();

    void init(int size);

    public long getEmptyEntries(boolean b);
    
}
