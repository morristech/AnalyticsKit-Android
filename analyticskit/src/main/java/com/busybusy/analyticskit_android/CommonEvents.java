/*
 * Copyright 2016 Busy, LLC
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

package com.busybusy.analyticskit_android;

/**
 * Defines constants used for common {@link AnalyticsEvent} objects.
 * The goal is to facilitate provider implementation of these types of events.
 *
 * @author John Hunt on 3/16/16.
 */
public interface CommonEvents
{
	String CONTENT_VIEW = "Content View";
	String ERROR        = "Error";
}
