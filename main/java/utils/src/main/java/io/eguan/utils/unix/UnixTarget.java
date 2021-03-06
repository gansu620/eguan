package io.eguan.utils.unix;

/*
 * #%L
 * Project eguan
 * %%
 * Copyright (C) 2012 - 2017 Oodrive
 * %%
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
 * #L%
 */

import java.io.IOException;

public interface UnixTarget {

    /**
     * Gets the device file path
     * 
     * @return a String containing the path
     */
    public String getDeviceFilePath();

    /**
     * Gets the suffix of the part 1
     * 
     * @return a String containg the suffix
     */
    public String getDevicePart1Suffix();

    /**
     * Login into the target
     * 
     * @throws IOException
     */
    public void login() throws IOException;

    /**
     * Logout the target
     * 
     * @throws IOException
     */
    public void logout() throws IOException;

}
