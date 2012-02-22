/*
   Copyright 2009-2011 Attila Szegedi

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.dynalang.dynalink.support;

import java.lang.invoke.MethodHandles;

/**
 * @author Attila Szegedi
 * @version $Id: $
 */
public class Backport {
    /**
     * True if Remi's JSR-292 backport agent is active; false if we're using native OpenJDK JSR-292 support.
     */
    public static final boolean inUse = MethodHandles.class.getName().startsWith("jsr292");
}