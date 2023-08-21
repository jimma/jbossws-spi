/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jboss.wsf.spi.metadata.j2ee.serviceref;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/** The unified metadata data for a handler chains element
 * 
 * @author Thomas.Diesler@jboss.org
 * @author alessio.soldano@jboss.com
 */
public class UnifiedHandlerChainsMetaData implements Serializable
{
   private static final long serialVersionUID = -4983482217732535558L;
   
   private final List<UnifiedHandlerChainMetaData> handlerChains;
   
   public UnifiedHandlerChainsMetaData(UnifiedHandlerChainMetaData... handlerChains)
   {
      this(handlerChains != null ? Arrays.asList(handlerChains) : null);
   }

   public UnifiedHandlerChainsMetaData(List<UnifiedHandlerChainMetaData> handlerChains)
   {
      if (handlerChains != null && !handlerChains.isEmpty()) {
         this.handlerChains = Collections.unmodifiableList(handlerChains);
      } else {
         this.handlerChains = Collections.emptyList();
      }
   }

   public List<UnifiedHandlerChainMetaData> getHandlerChains()
   {
      return handlerChains;
   }
}
