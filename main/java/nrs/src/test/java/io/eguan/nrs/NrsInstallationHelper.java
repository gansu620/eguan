package io.eguan.nrs;

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

import io.eguan.configuration.ConfigValidationException;
import io.eguan.configuration.MetaConfiguration;
import io.eguan.configuration.ValidConfigurationContext.ContextTestHelper;
import io.eguan.utils.mapper.FileMapperConfigurationContext;

import java.io.IOException;
import java.io.InputStream;

import org.junit.runners.model.InitializationError;

final class NrsInstallationHelper {

    private final ContextTestHelper<?> contextHelper = new TestValidNrsConfigurationContext().getTestHelper();

    private MetaConfiguration configuration;

    NrsInstallationHelper() {
        super();
    }

    final MetaConfiguration getConfiguration() {
        return configuration;
    }

    void setUpNrs() throws InitializationError {

        contextHelper.setUp();

        try {
            final InputStream inputConfig = ContextTestHelper.getPropertiesAsInputStream(contextHelper.getConfig());
            configuration = MetaConfiguration.newConfiguration(inputConfig, contextHelper.getContext(),
                    FileMapperConfigurationContext.getInstance());
        }
        catch (NullPointerException | IllegalArgumentException | ConfigValidationException | IOException e) {
            throw new InitializationError(e);
        }
    }

    void tearDownNrs() throws InitializationError {
        contextHelper.tearDown();
    }

}
