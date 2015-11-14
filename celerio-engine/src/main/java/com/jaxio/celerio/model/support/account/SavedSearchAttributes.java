/*
 * Copyright 2015 JAXIO http://www.jaxio.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jaxio.celerio.model.support.account;

import lombok.Data;

import com.jaxio.celerio.model.Attribute;

@Data
public class SavedSearchAttributes {
    private Attribute formClass;
    private Attribute name;
    private Attribute formContent;
    private Attribute account;

    public boolean isFormClassSet() {
        return formClass != null;
    }

    public boolean isNameSet() {
        return name != null;
    }

    public boolean isFormContentSet() {
        return formContent != null;
    }

    public boolean isAccountSet() {
        return account != null;
    }

    public boolean isComplete() {
        return isFormClassSet() //
                && isNameSet() //
                && isFormContentSet();
    }

}