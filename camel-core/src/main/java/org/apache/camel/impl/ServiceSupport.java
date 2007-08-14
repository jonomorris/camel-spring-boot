/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.impl;

import org.apache.camel.Service;
import org.apache.camel.util.ServiceHelper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;

/**
 * A useful base class which ensures that a service is only initialized once and
 * provides some helper methods for enquiring of its status
 *
 * @version $Revision$
 */
public abstract class ServiceSupport implements Service {
    private static int threadCounter;
    private AtomicBoolean started = new AtomicBoolean(false);
    private AtomicBoolean starting = new AtomicBoolean(false);
    private AtomicBoolean stopping = new AtomicBoolean(false);
    private AtomicBoolean stopped = new AtomicBoolean(false);
    private Collection childServices;

    public void start() throws Exception {
        if (started.compareAndSet(false, true)) {
            starting.set(true);
            try {
                if (childServices != null) {
                    ServiceHelper.startServices(childServices);
                }
                doStart();
            }
            finally {
                starting.set(false);
            }
        }
    }

    public void stop() throws Exception {
        if (started.get() && stopping.compareAndSet(false, true)) {
            try {
                doStop();
            }
            finally {
                if (childServices != null) {
                    ServiceHelper.stopServices(childServices);
                }
                stopped.set(true);
                started.set(false);
                stopping.set(false);
            }
        }
    }

    /**
     * @return true if this service has been started
     */
    public boolean isStarted() {
        return started.get();
    }

    /**
     * @return true if this service is 
     */
    public boolean isStarting() {
        return starting.get();
    }

    /**
     * @return true if this service is in the process of closing
     */
    public boolean isStopping() {
        return stopping.get();
    }

    /**
     * @return true if this service is closed
     */
    public boolean isStopped() {
        return stopped.get();
    }

    protected abstract void doStart() throws Exception;

    protected abstract void doStop() throws Exception;

    /**
     * Creates a new thread name with the given prefix
     */
    protected String getThreadName(String prefix) {
        return prefix + " thread:" + nextThreadCounter();
    }

    protected static synchronized int nextThreadCounter() {
        return ++threadCounter;
    }

    protected void addChildService(Object childService) {
        if (childServices == null) {
            childServices = new ArrayList();
        }
        childServices.add(childService);
    }

    protected boolean removeChildService(Object childService) {
        if (childServices != null) {
            return childServices.remove(childService);
        }
        else {
            return false;
        }
    }
}
