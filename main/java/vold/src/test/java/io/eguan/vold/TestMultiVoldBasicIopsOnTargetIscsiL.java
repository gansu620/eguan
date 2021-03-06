package io.eguan.vold;

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

import io.eguan.iscsisrv.InitiatorClientBasicIops;

public class TestMultiVoldBasicIopsOnTargetIscsiL extends TestMultiVoldBasicIopsOnTargetAbstractL {

    @Override
    public InitiatorClientBasicIops createClient(final int serverIndex) {
        // jSCSI
        return new InitiatorClientBasicIops("/jscsi.xsd",
                TestMultiVoldBasicIopsOnTargetIscsiL.class.getResource("/jscsi" + (serverIndex + 1) + ".xml"));
    }
}
