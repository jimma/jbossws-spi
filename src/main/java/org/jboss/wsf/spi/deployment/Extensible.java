/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2015, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.wsf.spi.deployment;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * A general extendible artifact 
 * 
 * @author Thomas.Diesler@jboss.com
 * @author <a href="mailto:ema@redhat.com">Jim Ma</a>
 * @since 20-Apr-2007 
 */
public interface Extensible extends RuntimeConfig
{
   /** Add arbitrary attachments */
   <T> T addAttachment(Class<T> key, Object value);
   
   /** Get arbitrary attachments */
   <T> Collection<T> getAttachments();
   
   /** Get an arbitrary attachment */
   <T> T getAttachment(Class<T> key);
   
   /** Remove arbitrary attachments */
   <T> T removeAttachment(Class<T> key);

   /** Get an property */
   Object getProperty(String key);
   
   /** Set a property */
   void setProperty(String key, Object value);
   
   /** Remove a property */
   void removeProperty(String key);
   
   /** Get the set of property names */
   Set<String> getProperties();
   
   /** Set a map of properties */
   void setProperties(Map<String, Object> props);   
}
