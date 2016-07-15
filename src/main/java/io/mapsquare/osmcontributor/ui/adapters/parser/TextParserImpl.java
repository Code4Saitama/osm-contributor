/**
 * Copyright (C) 2016 eBusiness Information
 *
 * This file is part of OSM Contributor.
 *
 * OSM Contributor is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OSM Contributor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OSM Contributor.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.mapsquare.osmcontributor.ui.adapters.parser;

import java.util.Arrays;
import java.util.List;

import io.mapsquare.osmcontributor.ui.adapters.item.TagItem;


public class TextParserImpl implements Parser {

    private static final List<String> TAG_KEYS_SUPPORTED = Arrays.asList("name");

    @Override
    public TagItem.Type getType() {
        return TagItem.Type.TEXT;
    }

    @Override
    public boolean isCandidate(String key, List<String> values) {
       return !TAG_KEYS_SUPPORTED.contains(key) || values.size() > 0;
    }

    @Override
    public boolean support(String value) {
        return true;
    }

    @Override
    public int getPriority() {
        return PRIORITY_LOW;
    }

    @Override
    public int hashCode() {
        return getPriority();
    }
}
