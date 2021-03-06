/* 
 * Created on Oct 27, 2005
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 * Copyright @2005 the original author or authors.
 */
package org.springmodules.cache.interceptor.caching;

import java.lang.reflect.Method;

/**
 * <p>
 * Factory of <code>{@link Method}s</code>.
 * </p>
 * 
 * @author Alex Ruiz
 */
public abstract class MethodFactory {

  public static Method createCacheableMethod() throws Exception {
    Class targetClass = String.class;
    return targetClass.getMethod("charAt", new Class[] { int.class });
  }

  public static Method createNonCacheableMethod() throws Exception {
    Class targetClass = String.class;
    return targetClass.getMethod("notify", new Class[0]);
  }

}
